package q2;

public class Triangulo extends FormaGeometrica{

    private int base;
    private int altura;


    @Override
    public double calcularArea() {
        return (this.base * this.altura)/2;
    }

    public Triangulo(int b, int h){
        this.base = b;
        this.altura = h;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    

}
