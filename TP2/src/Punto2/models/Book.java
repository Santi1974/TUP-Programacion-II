package Punto2.models;

public class Book implements Prestable {
    protected String title;
    protected String author;
    protected int publicationYear;
    protected boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("The book '" + title + "' has been borrowed.");
        } else {
            System.out.println("The book '" + title + "' is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' is not borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear + ", Borrowed: " + (borrowed ? "Yes" : "No");
    }
}