<li><code>search(String title)</code>: Busca um livro pelo título.</li>
</ul>

 <h3>2. Fila (Queue) - Gerenciamento de Reservas</h3>
    <p>A fila é usada para gerenciar a <strong>wishlist</strong> e as <strong>reservas de livros</strong> dos usuários, mantendo a ordem de chegada (FIFO).</p>

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
@@ -39,16 +79,16 @@ Estruturas de Dados Utilizadas

</pre>

  <h2>Tratamento de Exceções</h2>
  <p>Exceções personalizadas foram criadas para tratar erros específicos, como:</p>
<h2>Tratamento de Exceções</h2>
<p>Exceções personalizadas foram criadas para tratar erros específicos, como:</p>
<ul>
   <li><code>BookNotFoundException</code>: Livro não encontrado.</li>
   <li><code>ReservationNotFoundException</code>: Reserva não encontrada.</li>
   <li><code>UserNotFoundException</code>: Usuário não encontrado.</li>


  <h2>Pontos Avaliados no Projeto</h2>
  <ol>
<h2>Pontos Avaliados no Projeto</h2>
 <ol>
   <li>Implementação de <strong>Árvore Binária de Busca</strong>.</li>
   <li>Uso de <strong>Fila</strong> para reservas.</li>
   <li>Configuração de <strong>Segurança</strong> com autenticação.</li>
