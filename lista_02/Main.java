package lista_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();
        int opcao;

        do {
            System.out.println("\n===== MENU ZOOLÓGICO =====");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal");
            System.out.println("4. Emitir som de um animal");
            System.out.println("5. Testar habilidade de um animal");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> adicionarAnimal(scanner, zoologico);
                case 2 -> listarAnimais(zoologico);
                case 3 -> removerAnimal(scanner, zoologico);
                case 4 -> emitirSom(scanner, zoologico);
                case 5 -> testarHabilidade(scanner, zoologico);
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void adicionarAnimal(Scanner scanner, Zoologico zoologico) {
        System.out.println("\nEscolha o tipo de animal:");
        System.out.println("1. Gato");
        System.out.println("2. Cachorro");
        System.out.println("3. Passaro");
        System.out.print("Tipo: ");
        int tipo = Integer.parseInt(scanner.nextLine());

        System.out.print("ID: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Peso: ");
        double peso = Double.parseDouble(scanner.nextLine());

        Animal animal = switch (tipo) {
            case 1 -> new Gato(id, nome, idade, peso);
            case 2 -> new Cachorro(id, nome, idade, peso);
            case 3 -> new Passaro(id, nome, idade, peso);
            default -> null;
        };

        if (animal == null) {
            System.out.println("Tipo inválido!");
            return;
        }

        boolean adicionado = zoologico.adicionarAnimal(animal);
        System.out.println(adicionado
                ? "Animal adicionado com sucesso!"
                : "Já existe um animal com esse ID!");
    }

    private static void listarAnimais(Zoologico zoologico) {
        System.out.println("\n--- Animais cadastrados ---");
        if (zoologico.listarAnimais().isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal animal : zoologico.listarAnimais()) {
            System.out.println(animal);
        }
    }

    private static void removerAnimal(Scanner scanner, Zoologico zoologico) {
        System.out.print("\nID do animal a remover: ");
        long id = Long.parseLong(scanner.nextLine());
        boolean removido = zoologico.removerAnimal(id);
        System.out.println("Animal removido: " + removido);
    }

    private static void emitirSom(Scanner scanner, Zoologico zoologico) {
        System.out.print("\nID do animal: ");
        long id = Long.parseLong(scanner.nextLine());
        Animal animal = zoologico.buscarAnimal(id);
        if (animal != null) {
            System.out.println(animal.getNome() + " diz " + animal.emitirSom());
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    private static void testarHabilidade(Scanner scanner, Zoologico zoologico) {
        System.out.print("\nID do animal: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Habilidade a testar: ");
        String habilidade = scanner.nextLine();

        Animal animal = zoologico.buscarAnimal(id);
        if (animal != null) {
            System.out.println(animal.realizarHabilidade(habilidade));
        } else {
            System.out.println("Animal não encontrado.");
        }
    }
}