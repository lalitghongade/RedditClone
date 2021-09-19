package com.lala.springredditclone.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lala.springredditclone.model.Post;
import com.lala.springredditclone.model.User;
import com.lala.springredditclone.model.Vote;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}