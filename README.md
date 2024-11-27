<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <h1>Biblioteca Digital - Projeto Java com Estruturas de Dados</h1>
    <p>Este projeto é uma aplicação de <strong>Biblioteca Digital</strong> desenvolvida em <strong>Java</strong>, com foco na implementação de <strong>estruturas de dados</strong>, como <strong>Árvore Binária de Busca (BST)</strong> e <strong>Fila</strong>, além de funcionalidades como <strong>segurança básica</strong> e <strong>tratamento de exceções</strong>.</p>

Funcionalidades Principais
    <ul>
        <li><strong>Árvore Binária de Busca (BST)</strong> para Gerenciamento de Livros.</li>
        <li><strong>Fila (Queue)</strong> para Gerenciamento de Reservas.</li>
        <li><strong>Segurança</strong> implementada com Spring Security.</li>
        <li><strong>Tratamento de Exceções</strong> personalizadas para erros específicos.</li>
    </ul>

Estruturas de Dados Utilizadas
    <h3>1. Árvore Binária de Busca (BST) - <code>BookBST</code></h3>
    <p>A classe <code>BookBST</code> gerencia os livros utilizando uma árvore binária de busca.</p>
    <p><strong>Principais Métodos:</strong></p>
    <ul>
        <li><code>insert(BookModel book)</code>: Insere um livro na árvore.</li>
        <li><code>search(String title)</code>: Busca um livro pelo título.</li>
    </ul>

 <h3>2. Fila (Queue) - Gerenciamento de Reservas</h3>
    <p>A fila é usada para gerenciar a <strong>wishlist</strong> e as <strong>reservas de livros</strong> dos usuários, mantendo a ordem de chegada (FIFO).</p>

   <h2>Segurança da Aplicação</h2>
    <p>A segurança foi implementada usando <strong>Spring Security</strong>. As principais configurações incluem:</p>
    <ul>
        <li>Desativação temporária do CSRF para simplificação.</li>
        <li>Permissão de acesso público ao endpoint <code>/api/books</code>.</li>
        <li>Autenticação com usuários em memória.</li>

  </pre>

  <h2>Tratamento de Exceções</h2>
  <p>Exceções personalizadas foram criadas para tratar erros específicos, como:</p>
  <ul>
        <li><code>BookNotFoundException</code>: Livro não encontrado.</li>
        <li><code>ReservationNotFoundException</code>: Reserva não encontrada.</li>
        <li><code>UserNotFoundException</code>: Usuário não encontrado.</li>


  <h2>Pontos Avaliados no Projeto</h2>
  <ol>
        <li>Implementação de <strong>Árvore Binária de Busca</strong>.</li>
        <li>Uso de <strong>Fila</strong> para reservas.</li>
        <li>Configuração de <strong>Segurança</strong> com autenticação.</li>
        <li>Tratamento de <strong>Exceções</strong> personalizadas.</li>
    </ol>

  <h2>Tecnologias Utilizadas</h2>
  <ul>
        <li>Java 17</li>
        <li>Spring Boot</li>
        <li>Spring Security</li>
        <li>JPA/Hibernate</li>
        <li>H2 Database</li>
        <li>Maven</li>
    </ul>

 
  <h2>Conclusão</h2>
  <p>Este projeto demonstra o uso de estruturas de dados, segurança e tratamento de erros em uma aplicação de biblioteca digital desenvolvida em Java, atendendo aos requisitos propostos.</p>
</body>

</html>
