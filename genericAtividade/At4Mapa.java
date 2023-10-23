package genericAtividade;

import java.util.ArrayList;
import java.util.List;

public class At4Mapa<T> {

    private List<Item> itens;

    public At4Mapa() {
        this.itens = new ArrayList<>();
    }

    public boolean add(String chave, T valor) {
        for (Item item : itens) {
            if (item.getChave().equals(chave)) {
                return false;
            }
        }

        itens.add(new Item(chave, valor));
        return true;
    }

    public T get(String chave) {
        for (Item item : itens) {
            if (item.getChave().equals(chave)) {
                return item.getValor();
            }
        }

        return null;
    }

    private class Item {

        private String chave;
        private T valor;

        public Item(String chave, T valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public String getChave() {
            return chave;
        }

        public T getValor() {
            return valor;
        }
    }
}
