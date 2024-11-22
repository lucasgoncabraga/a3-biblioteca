# Biblioteca Online - Projeto

Este projeto é uma aplicação de biblioteca online desenvolvida utilizando Java com o framework Spring Boot. O objetivo é gerenciar livros, usuários e reservas de maneira eficiente, utilizando estruturas de dados como **Filas de Dados** e **Árvores Binárias** para otimizar o desempenho da aplicação.

## Requisitos

Antes de rodar o projeto, certifique-se de que os seguintes softwares estão instalados:

- **DBeaver**: Ferramenta para gerenciar o banco de dados MySQL.
- **Java JDK 21**: O projeto utiliza o Java 21.
- **IntelliJ IDEA**: IDE recomendada para o desenvolvimento do projeto.
- **MySQL**: Banco de dados utilizado para armazenar os dados da biblioteca.
  - **Host**: `localhost`
  - **Login**: `admin`
  - **Senha**: `admin`

## Estruturas de Dados Utilizadas

### Filas de Dados (FIFO - First In, First Out)

As **Filas de Dados** são usadas em situações onde é necessário manter a ordem de inserção dos itens. Elas são úteis em casos de **wishlist** (listas de desejos) e **reservas de livros**. A principal característica da fila é que os elementos são processados na ordem em que foram adicionados. Ou seja, **o primeiro a entrar é o primeiro a sair**.

#### Exemplos de uso:
- **Wishlist de Livros**: Os usuários podem adicionar livros desejados à sua fila de wishlist. O livro que foi adicionado primeiro será o primeiro a ser retirado, caso disponível.
- **Reserva de Livros**: Quando um usuário reserva um livro, ele entra em uma fila de reservas, e o livro será entregue na ordem em que as reservas foram feitas.

### Árvores Binárias

As **Árvores Binárias** são usadas para organizar os livros de maneira eficiente. Cada livro é armazenado com base em uma chave (por exemplo, título, autor ou ano de publicação), permitindo que os dados sejam acessados, inseridos ou removidos de forma rápida.

#### Exemplos de uso:
- **Organização e Busca de Livros**: Utiliza-se uma **Árvore Binária de Busca** (BST) para localizar livros rapidamente. Isso é útil para buscas por título, autor, ou outros atributos dos livros.
- **Inserção de Novos Livros**: Quando um novo livro é adicionado à biblioteca, ele é inserido de acordo com a chave, garantindo que a árvore permaneça balanceada e que futuras buscas sejam rápidas e eficientes.

## Funcionalidades do Sistema

A aplicação permite que os usuários realizem operações sobre livros e reservas, utilizando as estruturas de dados mencionadas:

- **Adição de livros à biblioteca**: Ao adicionar um livro, ele é inserido na **Árvore Binária**.
- **Criação de wishlist de livros**: Os usuários podem adicionar livros desejados à sua lista de espera (utilizando uma **Fila**).
- **Reserva de livros**: Quando um livro é reservado, o usuário é adicionado à fila de reservas, e o sistema garante que as reservas sejam atendidas na ordem de chegada.
