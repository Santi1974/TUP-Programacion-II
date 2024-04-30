package Punto2.models;

public class ChildrenBook extends Book {
    private String illustrator;

    public ChildrenBook(String title, String author, int publicationYear, String illustrator) {
        super(title, author, publicationYear);
        this.illustrator = illustrator;
    }
}