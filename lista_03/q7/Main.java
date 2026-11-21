package q7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o divisor: ");
            int denominador = scanner.nextInt();

            // A divisão inteira lança ArithmeticException se denominador == 0
            int resultado = numerador / denominador;

            System.out.printf("Resultado da divisão: %d / %d = %d%n", numerador, denominador, resultado);

        } catch (ArithmeticException e) {
            System.err.println("Erro: Não é possível dividir um número por zero.");

        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");

        } finally {
            // Executado sempre, ocorrendo exceção ou não
            System.out.println("Operação de divisão encerrada.");
            scanner.close();
        }
    }
}