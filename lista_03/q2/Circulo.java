package q2;

public class Circulo extends FormaGeometrica {

    private int raio;

    @Override
    public double calcularArea() {
        // return PI * raio^2
        return Math.PI*(Math.pow(getRaio(), 2));
    }

    public Circulo(int r){
        this.raio = r;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

}
