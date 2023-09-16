package br.com.todo.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import org.springframework.stereotype.Service;

import br.com.todo.todolist.entity.Todo;
import br.com.todo.todolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    
    // injecao de dependencia via construtor, sem precisar do @Autoride :)
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);

        return list();
    }

     public List<Todo> list() {

        // Criando um objeto de ordenação
        Sort sort = Sort.by("nome").ascending();

        return todoRepository.findAll(sort);
    };

     public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

     public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
