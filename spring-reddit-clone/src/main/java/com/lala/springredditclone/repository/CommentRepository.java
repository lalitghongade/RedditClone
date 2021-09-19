package com.lala.springredditclone.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lala.springredditclone.model.Comment;
import com.lala.springredditclone.model.Post;
import com.lala.springredditclone.model.User;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}