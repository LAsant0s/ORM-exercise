package com.assis.repository.ex3;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assis.domain.ex3.PostComment;

public interface PostCommentRepository extends JpaRepository<PostComment, Long>{

}
