package punto9;

public class Circle extends Figure {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}
