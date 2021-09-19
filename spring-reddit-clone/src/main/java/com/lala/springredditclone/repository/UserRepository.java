package com.lala.springredditclone.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lala.springredditclone.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}