import java.io.*;
import java.util.*;

public class Main {
    private static final String ARQUIVO = "usuarios.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Editar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> editar();
                case 4 -> excluir();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrar() {
        try (FileWriter fw = new FileWriter(ARQUIVO, true);
            BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            Usuario u = new Usuario(nome, email, idade);
            bw.write(u.toFileString());
            bw.newLine();

            System.out.println("Usuário cadastrado!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Usuario> lerUsuarios() {
        List<Usuario> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(Usuario.fromString(linha));
            }
        } catch (IOException e) {
            // arquivo pode não existir ainda
        }

        return lista;
    }

    private static void salvarLista(List<Usuario> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Usuario u : lista) {
                bw.write(u.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listar() {
        List<Usuario> lista = lerUsuarios();

        if (lista.isEmpty()) {
            System.out.println("Nenhum usuário encontrado.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }

    private static void editar() {
        List<Usuario> lista = lerUsuarios();
        listar();

        if (lista.isEmpty()) return;

        System.out.print("Escolha o índice para editar: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        Usuario u = lista.get(index);

        System.out.print("Novo nome: ");
        u.setNome(scanner.nextLine());

        System.out.print("Novo email: ");
        u.setEmail(scanner.nextLine());

        System.out.print("Nova idade: ");
        u.setIdade(scanner.nextInt());
        scanner.nextLine();

        salvarLista(lista);
        System.out.println("Usuário atualizado!");
    }

    private static void excluir() {
        List<Usuario> lista = lerUsuarios();
        listar();

        if (lista.isEmpty()) return;

        System.out.print("Escolha o índice para excluir: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        lista.remove(index);
        salvarLista(lista);

        System.out.println("Usuário removido!");
    }
}