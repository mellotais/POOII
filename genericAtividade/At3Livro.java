package genericAtividade;

public class At3Livro extends At3ProdutoX {

    private String autor;
    private String editora;

    public At3Livro(String nome, int quantidade, String autor, String editora) {
        super(nome, quantidade);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", editora=");
		builder.append(editora);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


}
