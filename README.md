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


<h2>2. Fila (Queue) Segunda Estrutura de Dados </h2>
    <p>O sistema utiliza uma fila para gerenciar a ordem de atendimento das reservas. A estrutura de dados <strong>fila</strong> garante que a primeira reserva feita seja a primeira a ser atendida.</p>

<h3>Como a Fila foi Implementada</h3>
 <p>Na classe <code>ReservationService</code>, uma instância de fila foi criada utilizando a interface <code>Queue</code> e a classe <code>LinkedList</code>:</p>

<pre>
        private final Queue&lt;Reservation&gt; reservationQueue = new LinkedList&lt;&gt;();
    </pre>
<p>Essa fila irá armazenar as reservas e garantir que a primeira a ser adicionada será a primeira a ser retirada (ordem FIFO).</p>

 <h3>Passos na Implementação da Fila</h3>
    <ol>
        <li><strong>Adicionar Reserva à Fila</strong><br>
            Para adicionar uma nova reserva à fila, usamos o método <code>offer()</code> da classe <code>Queue</code>, que insere o elemento no final da fila:
            <pre>
                public void addReservationToQueue(Reservation reservation) {
                    reservationQueue.offer(reservation);
                }
            </pre>
        </li>
        <li><strong>Obter a Próxima Reserva da Fila</strong><br>
            Para obter e remover a próxima reserva da fila (a mais antiga), utilizamos o método <code>poll()</code>, que retorna e remove o primeiro elemento:
            <pre>
                public Reservation nextReservationInQueue() {
                    return reservationQueue.poll();
                }
            </pre>
        </li>
    </ol>
    <p>Esses métodos garantem que as reservas sejam atendidas na ordem em que foram realizadas.</p>

 <h2>3. Funcionalidades do Serviço de Reservas</h2>
    <p>A classe <code>ReservationService</code> oferece diversas funcionalidades relacionadas à reserva de livros, como:</p>
    <ul>
        <li><strong>findAll()</strong> - Retorna todas as reservas armazenadas no banco de dados.</li>
        <li><strong>findById(Long id)</strong> - Retorna uma reserva específica, identificada por seu ID.</li>
        <li><strong>save(Reservation reservation)</strong> - Salva uma nova reserva no banco de dados.</li>
        <li><strong>updateReservation(Long id, Reservation updatedReservation)</strong> - Atualiza uma reserva existente.</li>
        <li><strong>deleteById(Long id)</strong> - Deleta uma reserva com base no ID.</li>
    </ul>

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
