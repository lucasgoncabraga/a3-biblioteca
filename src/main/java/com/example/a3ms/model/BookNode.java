package com.example.a3ms.model;

public class BookNode {
    public BookModel book;
    public BookNode left;
    public BookNode right;

    public BookNode(BookModel book){
        this.book = book;
        left = null;
        right = null;
    }
}
