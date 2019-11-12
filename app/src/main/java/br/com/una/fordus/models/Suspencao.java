package br.com.una.fordus.models;

import java.math.BigDecimal;

public class Suspencao {
    private String nome;
    private BigDecimal preco;
    private String estabilidade;

    public Suspencao(String nome, BigDecimal preco, String estabilidade) {
        this.nome = nome;
        this.preco = preco;
        this.estabilidade = estabilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getEstabilidade() {
        return estabilidade;
    }

    public void setEstabilidade(String estabilidade) {
        this.estabilidade = estabilidade;
    }

    @Override
    public String toString() {
        return nome + ", Estabilidade: " + estabilidade;
    }
}
