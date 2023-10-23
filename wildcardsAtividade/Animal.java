package wildcardsAtividade;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal: " + nome;
    }
}
