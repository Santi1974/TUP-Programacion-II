package modelos;

public class Oficial extends  Operador{
    private String oficialArea;

    public Oficial(String name, String operatorArea, String oficialArea) {
        super(name, operatorArea);
        this.oficialArea = oficialArea;
    }

    public String getOficialArea() {
        return oficialArea;
    }

    public void setOficialArea(String oficialArea) {
        this.oficialArea = oficialArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Oficial area: " + this.getOficialArea();
    }
}
