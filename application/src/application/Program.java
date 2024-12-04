package application;


import model.entities.Usuario;
import model.entities.UsuarioManager;

public class Program {
    public static void main(String[] args) {
        UsuarioManager usuarioManager = new UsuarioManager();

        // Adicionando usuários
        usuarioManager.adicionarUsuario(new Usuario("Alice", 30));
        usuarioManager.adicionarUsuario(new Usuario("Bob", 25));
        usuarioManager.adicionarUsuario(new Usuario("Charlie", 28));

        // Listando usuários
        usuarioManager.listarUsuarios();

        // Buscando um usuário
        Usuario usuarioBuscado = usuarioManager.buscarUsuario("Bob");
        System.out.println("Usuário buscado: " + usuarioBuscado);

        // Removendo um usuário
        usuarioManager.removerUsuario("Alice");

        // Listando usuários após remoção
        usuarioManager.listarUsuarios();
    }
}