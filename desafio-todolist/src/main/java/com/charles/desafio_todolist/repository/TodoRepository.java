package com.charles.desafio_todolist.repository;

import com.charles.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<Todo, Long> {
}
