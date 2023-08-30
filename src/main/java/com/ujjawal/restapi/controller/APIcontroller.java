package com.ujjawal.restapi.controller;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.ujjawal.restapi.exceptions.*;
import com.ujjawal.restapi.models.PasswordService;
import com.ujjawal.restapi.models.User;
import com.ujjawal.restapi.repo.UserRepo;

@RestController
public class APIcontroller {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordService passwordService;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome!!\nThis is a Assignment submitted to Ostello";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
    }

    @PostMapping(value = "/save")
    public String saveUsers(@Validated @RequestBody User user) {
        if (user.getUsername() == null || user.getEmail() == null || user.getPwd() == null) {
            throw new ValidationException("Required fields are missing");
        }
        user.setPwd(user.getPwd(), passwordService);
        userRepo.save(user);
        return "User Saved....";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @Validated @RequestBody User user) {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setEmail(user.getEmail());
        updatedUser.setUsername(user.getUsername());
        updatedUser.setPwd(user.getPwd(), passwordService);
        userRepo.save(updatedUser);
        return "Updated User ID: " + id;
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        User deletuser = userRepo.findById(id).get();
        userRepo.delete(deletuser);
        return "User deleted with ID: " + id;
    }
}
