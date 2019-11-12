package br.com.una.fordus.models;

import java.math.BigDecimal;

public class Direcao {

    private String nome;
    private BigDecimal preco;
    private String carga;

    public Direcao(String nome, BigDecimal preco, String carga) {
        this.nome = nome;
        this.preco = preco;
        this.carga = carga;
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

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return nome + ", Carga: " + carga;
    }
}
