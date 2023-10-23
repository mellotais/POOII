package genericAtividade;

public class At3ProdutoXMain {

    public static void main(String[] args) {
    	
        // Cria um produto do tipo Livro
    	At3Livro livro = new At3Livro("O Senhor dos Anéis", 10, "J.R.R. Tolkien", "HarperCollins");


        // Cria um produto do tipo Computador
    	At3Computador computador = new At3Computador("MacBook Pro", 2, "M2", 10000);


        // Cria um pedido
        At3Pedido pedido = new At3Pedido();

        // Adiciona os produtos ao pedido
        pedido.adicionarProduto(livro);
        pedido.adicionarProduto(computador);

        // Mostra os produtos do pedido
        pedido.mostrarProdutos();
    }
}
