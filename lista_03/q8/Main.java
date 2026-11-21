package q8;

public class Main {
    public static void main(String[] args) {
        // 1. Cadastro válido
        try {
            Produto p1 = new Produto("Monitor 24\"", 899.90, 10);
            System.out.println("Cadastrado com sucesso -> " + p1);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar produto 1: " + e.getMessage());
        }

        // 2. Cadastro inválido: nome vazio
        try {
            Produto p2 = new Produto("   ", 50.00, 5);
            System.out.println("Cadastrado com sucesso -> " + p2);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar produto 2: " + e.getMessage());
        }

        // 3. Cadastro inválido: preço zero ou negativo
        try {
            Produto p3 = new Produto("Mouse Gamer", 0.0, 15);
            System.out.println("Cadastrado com sucesso -> " + p3);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar produto 3: " + e.getMessage());
        }

        // 4. Cadastro inválido: quantidade negativa
        try {
            Produto p4 = new Produto("Headset USB", 180.00, -3);
            System.out.println("Cadastrado com sucesso -> " + p4);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar produto 4: " + e.getMessage());
        }
    }
}