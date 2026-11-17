public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private String senha;

    public Cliente(int id, String nome, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    
}