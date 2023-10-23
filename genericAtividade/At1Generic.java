package genericAtividade;

public class At1Generic<T> {

    private T dado;

    public At1Generic(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }
}
