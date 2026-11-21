package q1;
public abstract class Funcionario {
    private String nome;
    private Double salarioBase;

    public abstract double calcularSalario();

    public Funcionario (String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(double sB){
        this.salarioBase = sB;
    }

}
