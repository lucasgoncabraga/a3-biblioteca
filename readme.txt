# Biblioteca Java com Spring Boot

Este projeto é uma aplicação de biblioteca simples desenvolvida em Java utilizando o framework Spring Boot. Ele permite o gerenciamento de informações sobre livros, como título, autor e gênero, e oferece funcionalidades básicas para controle e manipulação desses dados.

## Estrutura do Projeto

A aplicação é composta pelas seguintes classes principais:

- **BookController**: Controla as requisições HTTP relacionadas aos livros. Define os endpoints REST que permitem realizar operações de CRUD, como criar, ler, atualizar e deletar livros.
  
- **BookModel**: Representa um livro na aplicação, contendo atributos como título, autor e gênero. É a classe que define a estrutura dos dados a serem manipulados e persistidos no banco de dados.
  
- **BookRepository**: Interface responsável pela comunicação com o banco de dados. Ela estende `JpaRepository` para fornecer operações básicas de CRUD no modelo `BookModel`.
  
- **BookService**: Camada de serviço que contém a lógica de negócios. Ela interage com o `BookRepository` para realizar operações de persistência de dados e implementa as regras de manipulação dos livros.

- **application.properties**: Arquivo de configuração da aplicação, onde estão definidas as propriedades do banco de dados, como URL, usuário e senha, além de configurações do JPA e Hibernate.

## Funcionalidades

- **Gerenciamento de livros**: A aplicação permite adicionar, consultar, atualizar e remover livros no banco de dados.


## Contribuição

Contribuições são bem-vindas! Se você tiver sugestões ou melhorias, fique à vontade para abrir um pull request ou criar uma issue para discussão.
