package com.example.a3ms.repository;

import com.example.a3ms.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {
    // Métodos de consulta adicionais podem ser definidos aqui
}

