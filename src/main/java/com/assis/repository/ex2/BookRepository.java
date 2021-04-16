package com.assis.repository.ex2;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assis.domain.ex2.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
