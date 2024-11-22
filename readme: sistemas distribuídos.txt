# Biblioteca Online - Projeto

Este projeto é uma aplicação de biblioteca online desenvolvida utilizando Java com o framework Spring Boot. O objetivo é gerenciar livros, usuários e reservas de maneira eficiente e intuitiva.

## Requisitos

Antes de rodar o projeto, certifique-se de que os seguintes softwares estão instalados:

- **DBeaver**: Ferramenta para gerenciar o banco de dados MySQL.
- **Java JDK 21**: O projeto utiliza o Java 21.
- **IntelliJ IDEA**: IDE recomendada para o desenvolvimento do projeto.
- **MySQL**: Banco de dados utilizado para armazenar os dados da biblioteca.
  - **Host**: `localhost`
  - **Login**: `admin`
  - **Senha**: `admin`

## Endpoints da API

A aplicação oferece os seguintes endpoints para gerenciar livros:

### 1. **GET /api/books**
- **Descrição**: Retorna todos os livros cadastrados na biblioteca.

### 2. **GET /api/books/{id}**
- **Descrição**: Retorna os detalhes de um livro específico, identificado pelo ID.

### 3. **POST /api/books**
- **Descrição**: Cria um novo livro na biblioteca com os dados fornecidos.

### 4. **PUT /api/books/{id}**
- **Descrição**: Atualiza as informações de um livro existente, identificado pelo ID.

### 5. **DELETE /api/books/{id}**
- **Descrição**: Deleta um livro da biblioteca, identificado pelo ID.

## Exceções

A aplicação trata exceções e retorna respostas apropriadas quando ocorrem erros.

### 1. **BookNotFoundException**
- **Descrição**: Retornada quando um livro não é encontrado no sistema pelo seu ID.

### 2. **ReservationNotFoundException**
- **Descrição**: Retornada quando uma reserva não é encontrada no sistema pelo seu ID.

### 3. **UserNotFoundException**
- **Descrição**: Retornada quando um usuário não é encontrado no sistema pelo seu ID.

---

