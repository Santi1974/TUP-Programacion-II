import Ejercicio1.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());
        cuadrado1.rotar();
        cuadrado1.dibujar();
    }
}