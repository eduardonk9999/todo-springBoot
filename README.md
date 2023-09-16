### TODO List

<h2>
    🚀 API para gerenciar tarefas (CRUD)
</h2>


<h2>
    ✅ Tecnologias utilizadas
</h2>

- Spring Boot
- Spring MVC
- Spring Data JPA
- H2



## 🎲 Rodando o projeto

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


- Resposta da API, quando criado a tarefa.

```
$ http GET :8080/todos
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```