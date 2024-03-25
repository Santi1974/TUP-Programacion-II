package modelos;

public class Tecnico extends Operador {
    private String tecnicoArea;

    public Tecnico(String name, String operatorArea, String tecnicoArea) {
        super(name, operatorArea);
        this.tecnicoArea = tecnicoArea;
    }

    public String getTecnicoArea() {
        return tecnicoArea;
    }

    public void setTecnicoArea(String tecnicoArea) {
        this.tecnicoArea = tecnicoArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Technician area: " + this.getTecnicoArea();
    }
}
