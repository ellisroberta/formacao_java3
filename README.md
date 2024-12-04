# Aplicação de Controle de Usuários com Coleções

Desenvolva uma aplicação que gerencie uma lista de usuários utilizando coleções (List, Set, Map) e Generics.

Saída Esperada:
- Implementação de uma classe Usuario.
- Métodos para adicionar, remover e buscar usuários.
- Uso de diferentes coleções para demonstrar funcionalidades.
- Exemplo de uso em um main.

# Gerenciador de Usuários

Esta é uma aplicação simples em Java que gerencia uma lista de usuários utilizando coleções (List, Set, Map) e Generics. A aplicação permite adicionar, remover e buscar usuários, demonstrando o uso de diferentes coleções.

## Funcionalidades

- Adicionar usuários à lista.
- Remover usuários da lista.
- Buscar usuários pelo nome.
- Listar todos os usuários.

## Tecnologias

- **Java 17**

## Estrutura do Projeto

O projeto é composto por três classes:

1. **Usuario.java**: Representa um usuário com atributos como nome e idade.
2. **UsuarioManager.java**: Gerencia a lista de usuários utilizando diferentes coleções.
3. **Program.java**: Classe principal que contém o método `main`, onde a aplicação é executada.

## Como Executar

### Pré-requisitos

- Java 17 instalado em sua máquina.

### Passos para Compilação e Execução

1. **Clone o repositório ou baixe os arquivos**:
    - Faça o download dos arquivos `Usuario.java`, `UsuarioManager.java`, e `Program.java`.

2. **Abra um terminal** e navegue até o diretório onde os arquivos estão salvos.

3. **Compile os arquivos Java**:
   ```bash
   javac Usuario.java UsuarioManager.java Program.java
    ```
4. **Execute o programa**:
   ```bash
   java Program
   ```
### Exemplo de Saída

Ao executar a aplicação, a saída será semelhante a:

```
Lista de Usuários:
Usuario{nome='Alice', idade=30}
Usuario{nome='Bob', idade=25}
Usuario{nome='Charlie', idade=28}
Usuário buscado: Usuario{nome='Bob', idade=25}
Lista de Usuários:
Usuario{nome='Bob', idade=25}
Usuario{nome='Charlie', idade=28}
```
