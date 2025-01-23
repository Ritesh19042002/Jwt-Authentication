package com.jwt.Authentication.repository;

import com.jwt.Authentication.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User>  findByEmail(String email);
    Optional<User> findByVerificationCode(String verification);
}
