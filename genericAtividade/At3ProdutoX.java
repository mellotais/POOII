package genericAtividade;

public abstract class At3ProdutoX {

    private String nome;
    private int quantidade;

    public At3ProdutoX(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

