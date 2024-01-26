import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RPG Life");

        // Criar uma lista de possibilidades
        while (true) {
            System.out.println("\n1. Criar novo jogo");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("O jogo começa...");
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
