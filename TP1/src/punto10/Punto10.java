package punto10;

public class Punto10 {
    public static void punto10() {

        System.out.println("Text Book: ");
        TextBook textBook = new TextBook("English 2", "Juan Alberto", "English");
        textBook.setPrice(25000);
        textBook.showInformation();

        System.out.println("Colombian University Text Book: ");
        ColombianUniversityTB CuTB = new ColombianUniversityTB("Math 3", "Juan Alberto", "Math", "Medellin School");
        CuTB.setPrice(30000);
        CuTB.showInformation();

        System.out.println("Novel: ");
        Novel novel = new Novel("Interstellar", "Christopher Nolan", "Science Fiction");
        novel.setPrice(25000);
        novel.showInformation();
    }
}