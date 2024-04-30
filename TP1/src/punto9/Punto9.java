package punto9;

public class Punto9 {
    public static void punto9(){
        System.out.println("Circle: ");
        Circle circle = new Circle(8);
        System.out.println("Circle's area: " + circle.calculateArea());
        System.out.println("Circle's perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle: ");
        Rectangle rectangle = new Rectangle(5, 12);
        System.out.println("Rectangle's area: " + rectangle.calculateArea());
        System.out.println("Rectangle's perimeter: " + rectangle.calculatePerimeter());
    }
}