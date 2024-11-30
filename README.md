<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Biblioteca Online - Projeto</title>
</head>
<body>

  <h1>Biblioteca Online - Projeto</h1>

  <p>Este projeto é uma aplicação de <strong>biblioteca online</strong> desenvolvida utilizando <strong>Java</strong> com o framework <strong>Spring Boot</strong>. O objetivo é gerenciar livros, usuários e reservas de maneira eficiente, utilizando estruturas de dados como <strong>Filas de Dados</strong> e <strong>Árvores Binárias</strong> para otimizar o desempenho e a organização das informações.</p>

  <h2>Requisitos</h2>
  <p>Antes de rodar o projeto, certifique-se de que os seguintes softwares estão instalados:</p>
  <ul>
    <li><strong>DBeaver</strong>: Ferramenta para gerenciar o banco de dados MySQL.</li>
    <li><strong>Java JDK 21</strong>: O projeto utiliza o Java 21.</li>
    <li><strong>IntelliJ IDEA</strong>: IDE recomendada para o desenvolvimento do projeto.</li>
    <li><strong>MySQL</strong>: Banco de dados utilizado para armazenar os dados da biblioteca.
      <ul>
        <li><strong>Host</strong>: <code>localhost</code></li>
        <li><strong>Login</strong>: <code>admin</code></li>
        <li><strong>Senha</strong>: <code>admin</code></li>
      </ul>
    </li>
  </ul>

  <h2>Estruturas de Dados Utilizadas</h2>

  <h3>Filas de Dados (FIFO - First In, First Out)</h3>
  <p>As <strong>Filas de Dados</strong> são usadas em situações onde é necessário manter a ordem de inserção dos itens. Elas são úteis em casos de <strong>wishlist</strong> (listas de desejos) e <strong>reservas de livros</strong>. A principal característica da fila é que os elementos são processados na ordem em que foram adicionados — ou seja, <strong>o primeiro a entrar é o primeiro a sair</strong>.</p>
  <ul>
    <li><strong>Wishlist de Livros</strong>: Os usuários podem adicionar livros desejados à sua fila de wishlist. O livro que foi adicionado primeiro será o primeiro a ser retirado, caso disponível.</li>
    <li><strong>Reserva de Livros</strong>: Quando um usuário reserva um livro, ele entra em uma fila de reservas, sendo atendido na ordem de chegada.</li>
  </ul>

  <h3>Árvores Binárias</h3>
  <p>As <strong>Árvores Binárias</strong> são usadas para organizar os livros de maneira eficiente. Cada livro é armazenado com base em uma chave (exemplo: título, autor, ano de publicação), permitindo que os dados sejam acessados de forma rápida.</p>
  <ul>
    <li><strong>Organização e Busca de Livros</strong>: Utiliza-se uma <strong>Árvore Binária de Busca (BST)</strong> para localizar livros rapidamente.</li>
    <li><strong>Inserção de Novos Livros</strong>: Quando um novo livro é adicionado, ele é inserido de acordo com a chave, mantendo a árvore balanceada e as buscas rápidas.</li>
  </ul>

  <h2>Funcionalidades do Sistema</h2>
  <p>A aplicação permite que os usuários realizem operações sobre livros e reservas utilizando as estruturas de dados mencionadas:</p>
  <ul>
    <li><strong>Adição de livros à biblioteca</strong>: Ao adicionar um livro, ele é inserido na <strong>Árvore Binária</strong>.</li>
    <li><strong>Criação de wishlist de livros</strong>: Os usuários podem adicionar livros desejados à sua lista de espera (utilizando uma <strong>Fila</strong>).</li>
    <li><strong>Reserva de livros</strong>: Quando um livro é reservado, o usuário entra na fila de reservas e o livro será entregue na ordem de chegada.</li>
  </ul>

  <h2>Endpoints da API</h2>
  <p>A aplicação oferece os seguintes <strong>endpoints</strong> para gerenciar livros:</p>
  <ol>
    <li><strong>GET /api/books</strong>: Retorna todos os livros cadastrados na biblioteca.</li>
    <li><strong>GET /api/books/{id}</strong>: Retorna os detalhes de um livro específico, identificado pelo ID.</li>
    <li><strong>POST /api/books</strong>: Cria um novo livro na biblioteca com os dados fornecidos.</li>
    <li><strong>PUT /api/books/{id}</strong>: Atualiza as informações de um livro existente, identificado pelo ID.</li>
    <li><strong>DELETE /api/books/{id}</strong>: Deleta um livro da biblioteca, identificado pelo ID.</li>
  </ol>

  <h2>Exceções</h2>
  <p>A aplicação trata exceções e retorna respostas apropriadas quando ocorrem erros:</p>
  <ul>
    <li><strong>BookNotFoundException</strong>: Retornada quando um livro não é encontrado no sistema pelo seu ID.</li>
    <li><strong>ReservationNotFoundException</strong>: Retornada quando uma reserva não é encontrada no sistema pelo seu ID.</li>
    <li><strong>UserNotFoundException</strong>: Retornada quando um usuário não é encontrado no sistema pelo seu ID.</li>
  </ul>

</body>
</html>
