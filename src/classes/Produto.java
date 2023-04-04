package classes;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal valor;
    private String descricao;

    public Produto(String nome, BigDecimal valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
