package com.lala.springredditclone.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lala.springredditclone.model.Subreddit;

import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}