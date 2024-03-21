import java.util.List;
import java.util.Scanner;

public class Tarefa1 {
    public static void executar(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Usuario usuario = new Usuario(nome, idade, email, telefone, endereco);
        usuarios.add(usuario);
        System.out.println("Usuário " + nome + " cadastrado com sucesso!\n");
    }
}
