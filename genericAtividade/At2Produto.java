package genericAtividade;

import java.util.Date;

public class At2Produto<T> {
    private T id;
    private double valor;
    private Date dataFabricacao;
    private Date dataVencimento;

    public At2Produto(T id, double valor, Date dataFabricacao, Date dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public T getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setId(T id) {
        this.id = id;
    }
}


