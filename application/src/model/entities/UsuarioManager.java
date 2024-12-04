package model.entities;

import java.util.*;

public class UsuarioManager {

    private List<Usuario> usuariosList; // Exemplo de List
    private Set<Usuario> usuariosSet; // Exemplo de Set
    private Map<String, Usuario> usuariosMap; // Exemplo de Map

    public UsuarioManager() {
        this.usuariosList = new ArrayList<>();
        this.usuariosSet = new HashSet<>();
        this.usuariosMap = new HashMap<>();
    }

    // Método para adicionar um usuário
    public void adicionarUsuario(Usuario usuario) {
        usuariosList.add(usuario);
        usuariosSet.add(usuario);
        usuariosMap.put(usuario.getNome(), usuario);
    }

    // Método para remover um usuário
    public void removerUsuario(String nome) {
        Usuario usuario = usuariosMap.remove(nome);
        usuariosList.remove(usuario);
        usuariosSet.remove(usuario);
    }

    // Método para buscar um usuário
    public Usuario buscarUsuario(String nome) {
        return usuariosMap.get(nome);
    }

    // Método para listar todos os usuários
    public void listarUsuarios() {
        System.out.println("Lista de Usuários:");
        for (Usuario usuario : usuariosList) {
            System.out.println(usuario);
        }
    }
}
