package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getTodoList();
    Todo addTodo(String name, String description);
}
