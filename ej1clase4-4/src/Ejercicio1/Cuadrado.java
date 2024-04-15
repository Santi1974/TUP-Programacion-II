package Ejercicio1;

public class Cuadrado implements Figura, Dibujable, Rotable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando cuadrado");
    }

    @Override
    public void rotar(){
        System.out.println("Rotando cuadrado");
    }
}
