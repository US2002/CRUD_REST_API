package com.ujjawal.restapi.repo;

//!For SQL // import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ujjawal.restapi.models.User;

//!For SQL // public interface UserRepo extends JpaRepository<User, Long> {
@Repository
public interface UserRepo extends MongoRepository<User, Long> {

}
