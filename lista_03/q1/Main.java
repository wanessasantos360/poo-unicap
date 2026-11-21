package q1;
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioCLT("Zezinho", 1600);
        Funcionario f2 = new FuncionarioPJ("Joana", 2000);

        System.out.printf("R$ %.2f \n",f1.calcularSalario());
        System.out.printf("R$ %.2f \n",f2.calcularSalario());
    }
}
