
# CRUD_SPRING_PROJECT


### Tecnologias Utilizadas

Este projeto utiliza as seguintes tecnologias:

- **Spring Web:** Framework para desenvolvimento de aplicações web com Spring MVC.
- **Spring Data JPA:** Facilita o acesso aos dados através da abstração do JPA.
- **MySQL Driver:** Driver JDBC para conexão com o banco de dados MySQL.
- **Postman:** Utilizado para testar e documentar APIs RESTful.




## Documentação da API

#### Retorna todos os usuários

```http
  GET users/find
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Todos usuários já cadastrados |

#### Retorna um usuário

```http
  GET /users/find/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `String` | **Obrigatório**. O ID do usuário desejado

#### Criação de um usuário

```http
  POST /users/create
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `username / password`      | `String` | **Obrigatório**. Username e Password

#### Atualiza dados de um usuário

```http
  PUT /users/update/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id, username, password`      | `Long, String` | **Obrigatório**. ID, Username e Password

#### Deletar usuário

```http
  DELETE /users/delete/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário desejado


### Demonstração

Para demonstrar as funcionalidades principais deste projeto CRUD usando Spring Web, Spring Data JPA e MySQL Driver, você pode seguir estes passos simples usando o Postman:

1. **Criar um novo usuário:**
   - URL: `POST http://localhost:8080/users/create`
   - Body (JSON):
     ```json
     {
       "username": "usuario1",
       "password": "senha123"
     }
     ```
   - Esperado: Receber código de status 201 Created e o usuário criado como resposta.

2. **Obter todos os usuários:**
   - URL: `GET http://localhost:8080/users/find`
   - Esperado: Receber código de status 200 OK e uma lista de todos os usuários cadastrados.

3. **Atualizar um usuário existente:**
   - URL: `PUT http://localhost:8080/users/update`
   - Body (JSON):
     ```json
     {
       "id": 1,
       "username": "novousuario",
       "password": "novasenha"
     }
     ```
   - Esperado: Receber código de status 200 OK e o usuário atualizado como resposta.

4. **Deletar um usuário:**
   - URL: `DELETE http://localhost:8080/users/delete`
   - Body (JSON):
     ```json
     {
       "id": 1
     }
     ```
   - Esperado: Receber código de status 204 No Content indicando sucesso na remoção.

---

Aqui está um vídeo demonstrativo que mostra como usar estas funcionalidades com o Postman: [Link para o vídeo](https://youtu.be/7VKoY_Wkvqo).
## 🔗 Links
[![portfolio](https://img.shields.io/badge/github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/gabfarmarcondes)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](www.linkedin.com/in/gabfariasmarcondes)


