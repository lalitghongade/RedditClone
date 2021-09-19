package com.lala.springredditclone.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lala.springredditclone.model.Post;
import com.lala.springredditclone.model.Subreddit;
import com.lala.springredditclone.model.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
