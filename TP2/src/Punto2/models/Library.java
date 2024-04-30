package Punto2.models;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book '" + book.title + "' added to the library.");
    }

    public void listAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : bookList) {
            if (!book.borrowed) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : bookList) {
            if (book.title.equals(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("The book '" + title + "' is not in the library.");
    }

    public void returnBook(String title) {
        for (Book book : bookList) {
            if (book.title.equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Cannot return the book '" + title + "'.");
    }
}