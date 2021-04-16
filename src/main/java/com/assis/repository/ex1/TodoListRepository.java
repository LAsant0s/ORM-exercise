package com.assis.repository.ex1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assis.domain.ex1.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList, Integer>{

}
