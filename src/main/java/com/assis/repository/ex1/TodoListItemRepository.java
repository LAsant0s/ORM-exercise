package com.assis.repository.ex1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assis.domain.ex1.TodoListItem;

public interface TodoListItemRepository extends JpaRepository<TodoListItem, Integer>{

}
