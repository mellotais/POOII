package testeTarefa;

public class Coluna {

    private String nome;
    private String tipo;
    private boolean naoNulo;
    private boolean autoIncremento;

    public Coluna(String nome, String tipo, boolean naoNulo, boolean autoIncremento) {
        this.nome = nome;
        this.tipo = tipo;
        this.naoNulo = naoNulo;
        this.autoIncremento = autoIncremento;
    }

    public String gerarScript() {
        StringBuilder script = new StringBuilder();
        script.append(nome);
        script.append(" ");
        script.append(tipo);

        if (naoNulo) {
            script.append(" NOT NULL");
        }

        if (autoIncremento) {
            script.append(" AUTO_INCREMENT");
        }

        return script.toString();
    }
}
