package genericAtividade;

import java.util.Date;

public class At2ProdutoMain {
    public static void main(String[] args) {
    	
        // Exemplo com ID Integer
        At2Produto<Integer> produtoInteiro = new At2Produto<>(1001, 29.99, new Date(), new Date());
        System.out.println("ID do Produto (Integer): " + produtoInteiro.getId());

        // Exemplo com ID String
        At2Produto<String> produtoString = new At2Produto<>("A123", 39.99, new Date(), new Date());
        System.out.println("ID do Produto (String): " + produtoString.getId());
    }
}