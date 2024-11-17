package com.example.a3ms.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private BookModel book;

    @ManyToOne
    private UserModel user;

    private LocalDate withdrawDate;
    private LocalDate devolutionDate;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BookModel getBook() {
        return book;
    }
    public void setBook(BookModel book) {
        this.book = book;
    }
    public UserModel getUser() {
        return user;
    }
    public void setUser(UserModel user) {
        this.user = user;
    }
    public LocalDate getWithdrawDate() {
        return withdrawDate;
    }
    public void setWithdrawDate(LocalDate withdrawDate) {
        this.withdrawDate = withdrawDate;
    }
    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
}

