package genericAtividade;

public class At3Computador extends At3ProdutoX {

    private String modelo;
    private double preco;

    public At3Computador(String nome, int quantidade, String modelo, double preco) {
        super(nome, quantidade);
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [modelo=");
		builder.append(modelo);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
    
    
}
