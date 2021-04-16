package com.assis.repository.ex3;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assis.domain.ex3.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
