package genericAtividade;

import java.util.ArrayList;
import java.util.List;

public class At3Pedido {

    private List<At3ProdutoX> produtos;

    public At3Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(At3ProdutoX produto) {
        this.produtos.add(produto);
    }

    public void mostrarProdutos() {
        for (At3ProdutoX produto : this.produtos) {
            System.out.println(produto);
        }
    }
}