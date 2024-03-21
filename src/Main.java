import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        List<Usuario> usuarios = new ArrayList<>();

        while (true) {
            menu.imprimirMenuCadastro();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                Tarefa1.executar(scanner, usuarios);
            } else if (opcao == 2) {
                Tarefa2.executar(usuarios);
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
