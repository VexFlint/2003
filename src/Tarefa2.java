import java.util.List;

public class Tarefa2 {
    public static void executar(List<Usuario> usuarios) {
        System.out.println("\nLista de Usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        System.out.println();
    }
}
