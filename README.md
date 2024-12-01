<h2>Sobre o Projeto</h2>

<p>Este projeto tem como objetivo o desenvolvimento de uma <strong>biblioteca online</strong>, com o intuito de obter nota para a UC (Unidade Curricular) de <strong>Estrutura de Dados e Análise de Algoritmos</strong>. O projeto foi desenvolvido para demonstrar a aplicação prática de conceitos de estruturas de dados e técnicas de programação.</p>

<p>No decorrer do desenvolvimento, foram utilizadas diversas estruturas de dados para garantir a eficiência e a organização do sistema. Entre as principais estruturas utilizadas, destacam-se:</p>

<ul>
    <li><strong>Filas (Queue)</strong>: Utilizadas para gerenciar a ordem de reservas dos livros, garantindo que o primeiro pedido seja o primeiro a ser atendido (FIFO).</li>
    <li><strong>Árvores Binárias</strong>: Empregadas para organizar e buscar os livros de maneira eficiente, melhorando a performance do sistema na busca e manipulação dos dados.</li>
</ul>

<p>Além das estruturas de dados, o projeto também implementou <strong>configurações de segurança com autenticação</strong>, utilizando a classe Security.Config definindo um serviço de usuários em memória com credenciais codificadas e papéis de "USER" e "ADMIN".</p>



<li><code>search(String title)</code>: Busca um livro pelo título.</li>
</ul>

 <h3>1. Fila (Queue) - Gerenciamento de Reservas</h3>
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

<h2>4. Estrutura de Árvore Binária de Busca (BST) para Gerenciar Livros</h2>

<p>
  Este projeto utiliza uma implementação de <strong>Árvore Binária de Busca (Binary Search Tree - BST)</strong> 
  para organizar e buscar livros na biblioteca online. A estrutura é implementada pela classe 
  <code>BookBST</code>, com suporte de duas classes auxiliares:
  <ul>
    <li><code>BookModel</code>: Representa o modelo de dados de um livro, contendo atributos como título.</li>
    <li><code>BookNode</code>: Representa cada nó da árvore, armazenando um <code>BookModel</code> e referências para os nós filhos esquerdo e direito.</li>
  </ul>
</p>

<h3>Funcionalidades</h3>
<ul>
  <li>
    <strong>Inserção de livros:</strong>
    <p>
      A inserção é realizada pelo método público <code>insert(BookModel book)</code> na classe <code>BookBST</code>.
      Este método utiliza a função recursiva privada <code>insertRec(BookNode root, BookModel book)</code>, que percorre a árvore para encontrar a posição correta:
      <ul>
        <li>Se o nó atual (representado por um objeto <code>BookNode</code>) for <code>null</code>, é criado um novo nó com o livro fornecido.</li>
        <li>Se o título do novo livro for alfabeticamente menor que o título do nó atual (comparação feita com <code>book.getTitle().compareTo(root.book.getTitle())</code>), o método continua no lado esquerdo da árvore.</li>
        <li>Se for maior, continua no lado direito.</li>
      </ul>
    </p>
    <p>Referência no código: veja os métodos <code>insert</code> e <code>insertRec</code> na classe <code>BookBST</code>.</p>
  </li>

  <li>
    <strong>Busca de livros:</strong>
    <p>
      A busca é realizada pelo método público <code>search(String title)</code>, que utiliza a função recursiva privada 
      <code>searchRec(BookNode root, String title)</code> para navegar pela árvore:
      <ul>
        <li>Se o nó atual for <code>null</code> ou se o título do nó atual corresponder ao título buscado, o método retorna o livro armazenado no nó (<code>root.book</code>).</li>
        <li>Se o título buscado for menor que o título do nó atual, a busca continua no lado esquerdo.</li>
        <li>Se for maior, a busca segue no lado direito.</li>
      </ul>
      Este processo termina quando o livro é encontrado ou quando um nó vazio é alcançado (indicando que o livro não está na árvore).
    </p>
  </li>
</ul>

<h3>Estrutura do Código</h3>
<p>A classe <code>BookBST</code> gerencia os dados com os seguintes componentes:</p>
<ul>
  <li>
    <code>private BookNode root;</code> — O nó raiz da árvore, que inicia como <code>null</code>.
  </li>
  <li>
    <code>public void insert(BookModel book);</code> — Método público para inserir um livro na árvore.
  </li>
  <li>
    <code>private BookNode insertRec(BookNode root, BookModel book);</code> — Método recursivo que encontra a posição correta para o livro.
  </li>
  <li>
    <code>public BookModel search(String title);</code> — Método público para buscar um livro pelo título.
  </li>
  <li>
    <code>private BookModel searchRec(BookNode root, String title);</code> — Método recursivo que realiza a busca na árvore.
  </li>
</ul>

<h2>5. Segurança da Aplicação</h2>
<p>
A classe <code>SecurityConfig</code> utiliza o Spring Security para gerenciar a segurança da aplicação, com os seguintes recursos:
</p>
<ul>
  <li><strong>Acesso Público:</strong> O endpoint <code>/api/books/**</code> está acessível sem autenticação.</li>
  <li><strong>Acesso Protegido:</strong> Todos os outros endpoints requerem autenticação.</li>
  <li><strong>Usuários e Papéis:</strong> Dois usuários estão configurados na memória:
    <ul>
      <li><code>user</code>: senha <code>password</code>, papel <code>USER</code>.</li>
      <li><code>admin</code>: senha <code>admin</code>, papel <code>ADMIN</code>.</li>
    </ul>
  </li>
  <li><strong>Login e Logout:</strong> Páginas padrão do Spring Security são utilizadas para login e logout.</li>
  <li><strong>Criptografia de Senhas:</strong> As senhas são armazenadas utilizando o algoritmo <code>BCrypt</code>.</li>
  <li><strong>CSRF:</strong> A proteção contra CSRF está desativada para simplificação no ambiente de desenvolvimento.</li>
</ul>
</pre>

<h3>6. Endpoints da Aplicação</h3>
<p>
  A classe <code>BookController</code> é responsável por expor os endpoints REST da API relacionados a livros. 
  Ela utiliza o Spring Framework para definir as rotas e gerenciar as requisições. A base da URL é definida pela 
  anotação <code>@RequestMapping("/api/books")</code>. Cada método mapeia uma operação específica 
  (como criação, leitura, atualização ou exclusão de livros).
</p>
<ul>
  <li>
    <strong>Interação com o Serviço:</strong> A <code>BookController</code> utiliza a classe <code>BookService</code> 
    (injeção via <code>@Autowired</code>) para delegar as operações relacionadas à manipulação e persistência de dados.
  </li>
  <li>
    <strong>Retorno das Respostas:</strong> Os métodos retornam objetos <code>ResponseEntity</code>, garantindo respostas 
    HTTP apropriadas (<code>200 OK</code>, <code>404 Not Found</code>, etc.) para cada tipo de operação.
  </li>
</ul>

<h3>Endpoints</h3>
<table>
  <thead>
    <tr>
      <th>Método HTTP</th>
      <th>URL</th>
      <th>Descrição</th>
      <th>Classe/Método</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>GET</td>
      <td>/api/books</td>
      <td>Retorna todos os livros.</td>
      <td><code>BookController#getAllBooks()</code></td>
    </tr>
    <tr>
      <td>GET</td>
      <td>/api/books/{id}</td>
      <td>Retorna um livro pelo ID.</td>
      <td><code>BookController#getBookById(Long id)</code></td>
    </tr>
    <tr>
      <td>POST</td>
      <td>/api/books</td>
      <td>Cria um novo livro.</td>
      <td><code>BookController#createBook(BookModel)</code></td>
    </tr>
    <tr>
      <td>PUT</td>
      <td>/api/books/{id}</td>
      <td>Atualiza um livro pelo ID.</td>
      <td><code>BookController#updateBook(Long id, BookModel)</code></td>
    </tr>
    <tr>
      <td>DELETE</td>
      <td>/api/books/{id}</td>
      <td>Deleta um livro pelo ID.</td>
      <td><code>BookController#deleteBook(Long id)</code></td>
    </tr>
  </tbody>
</table>


  <h2>7. Tratamento de Exceções</h2>
<p>Exceções personalizadas foram criadas para tratar erros específicos, como:</p>
<ul>
   <li><code>BookNotFoundException</code>: Livro não encontrado.</li>
   <li><code>ReservationNotFoundException</code>: Reserva não encontrada.</li>
   <li><code>UserNotFoundException</code>: Usuário não encontrado.</li>
</ul>


<h2>8. Pontos Avaliados no Projeto</h2>
 <ol>
   <li>Implementação de <strong>Árvore Binária de Busca</strong>.</li>
   <li>Uso de <strong>Fila</strong> para reservas.</li>
   <li>Configuração de <strong>Segurança</strong> com autenticação.</li>

 </ol>
 </ol>

   <h2>9. Requisitos</h2>

<p>Antes de rodar o projeto, certifique-se de que os seguintes softwares estão instalados:</p>

<ul>
  <li><strong>DBeaver</strong>: Ferramenta para gerenciar o banco de dados MySQL.</li>
  <li><strong>Java JDK 21</strong>: O projeto utiliza o Java 21.</li>
  <li><strong>IntelliJ IDEA</strong>: IDE recomendada para o desenvolvimento do projeto.</li>
  <li><strong>MySQL</strong>: Banco de dados utilizado para armazenar os dados da biblioteca.</li>
</ul>

<p><strong>Configuração do banco de dados:</strong></p>
<ul>
 
  <li><strong>Host</strong>: <code>localhost</code></li>
  <li><strong>Login</strong>: <code>admin</code></li>
  <li><strong>Senha</strong>: <code>admin</code></li>
</ul>






