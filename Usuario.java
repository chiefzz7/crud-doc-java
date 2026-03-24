public class Usuario {
    private String nome;
    private String email;
    private int idade;

    // Constructor
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String toFileString() {
        return nome + ";" + email + ";" + idade;
    }

    public static Usuario fromString(String linha) {
        String[] partes = linha.split(";");
        return new Usuario(partes[0], partes[1], Integer.parseInt(partes[2]));
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public int getIdade() { return idade; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Idade: " + idade;
    }
}