package com.ujjawal.restapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;

@Document(collection = "users")
public class User {
    @Id
    // !For SQL @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @jakarta.validation.constraints.NotBlank(message = "Username is required")
    // !For SQL //@Column
    private String username;

    @jakarta.validation.constraints.NotBlank(message = "Email is required")
    @jakarta.validation.constraints.Email(message = "Invalid email format")
    // !For SQL // @Column(unique = true)
    private String email;

    @jakarta.validation.constraints.NotBlank(message = "Password is required")
    // !For SQL // @Column
    private String pwd;

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd, PasswordService passwordService) {
        this.pwd = passwordService.hashPassword(pwd);
    }

}
