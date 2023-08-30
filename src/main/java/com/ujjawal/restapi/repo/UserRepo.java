package com.ujjawal.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ujjawal.restapi.models.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
