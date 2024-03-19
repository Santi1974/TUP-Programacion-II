package punto1.clases;

public class Motorbike extends Bike {
    private double km_h;
    private int cc;

    public Motorbike(String color, int wheels, String type, int km_h, int cc) {
        super(color, wheels, type);
        this.km_h = km_h;
        this.cc = cc;
    }

    public double getKm_h() {
        return km_h;
    }

    public void setKm_h(double km_h) {
        this.km_h = km_h;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}