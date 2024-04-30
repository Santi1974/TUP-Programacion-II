package Punto2.models;

public class University extends Book {
    private String field;

    public University(String title, String author, int publicationYear, String field) {
        super(title, author, publicationYear);
        this.field = field;
    }
}