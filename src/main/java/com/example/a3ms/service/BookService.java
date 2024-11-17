package com.example.a3ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.a3ms.repository.BookRepository;
import com.example.a3ms.model.BookModel;
import com.example.a3ms.exception.BookNotFoundException;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    private final BookBST bookBST;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.bookBST = new BookBST();
        initializeBST();
    }

    private void initializeBST(){
        for (BookModel book : bookRepository.findAll()){
            bookBST.insert(book);
        }
    }

    public BookModel search(String title){
        return bookBST.search(title);
    }

    public List<BookModel> findAll() {
        return bookRepository.findAll();
    }

    public BookModel findById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    public BookModel save(BookModel book) {
        return bookRepository.save(book);
    }

    public BookModel updateBook(Long id, BookModel updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setGender(updatedBook.getGender());
            book.setPublicationYear(updatedBook.getPublicationYear());
            book.setAvailableQuantity(updatedBook.getAvailableQuantity());
            return bookRepository.save(book);
        }).orElseThrow(() -> new BookNotFoundException(id));
    }

    public void deleteById(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException(id);
        }
        bookRepository.deleteById(id);
    }
}
