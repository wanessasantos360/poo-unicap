package q2;

public class Retangulo extends FormaGeometrica {

    private int lado;

    @Override
    public double calcularArea() {
        return Math.pow(getLado(), 2);
    }

    public Retangulo(int l){
        this.lado = l;
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    

}
