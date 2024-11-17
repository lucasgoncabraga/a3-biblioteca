package com.example.a3ms.service;

import com.example.a3ms.model.BookModel;
import com.example.a3ms.model.BookNode;

public class BookBST {
    private BookNode root;

    public BookBST() {
        root = null;
    }

    public void insert(BookModel book) {
        root = insertRec(root, book);
    }

    private BookNode insertRec(BookNode root, BookModel book) {
        if (root == null) {
            root = new BookNode(book);
            return root;
        }

        if (book.getTitle().compareTo(root.book.getTitle()) < 0)
            root.left = insertRec(root.left, book);
        else if (book.getTitle().compareTo(root.book.getTitle()) > 0)
            root.right = insertRec(root.right, book);

        return root;
    }

    public BookModel search(String title) {
        return searchRec(root, title);
    }

    private BookModel searchRec(BookNode root, String title) {
        if (root == null || root.book.getTitle().equals(title)) {
            assert root != null;
            return root.book;
        }

        if (root.book.getTitle().compareTo(title) > 0)
            return searchRec(root.left, title);

        return searchRec(root.right, title);
    }
}

