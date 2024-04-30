package Punto2;
import Punto2.models.*;
public class Punto2 {
    public static void punto2(String[] args) {
        Library library = new Library();

        Novel book1 = new Novel("Novel 1", "Author 1", 1999, "Drama");
        University book2 = new University("University Book 1", "Author 2", 2015, "Math");
        ChildrenBook book3 = new ChildrenBook("Children Book 1", "Author 3", 2020, "Elena Walsh");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.listAvailableBooks();
        library.borrowBook("University Book 1");
        library.returnBook("University Book 1");
    }
}
