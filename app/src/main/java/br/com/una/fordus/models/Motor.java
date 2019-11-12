package br.com.una.fordus.models;

import java.math.BigDecimal;

public class Motor {

    private String nome;
    private BigDecimal preco;
    private Integer potencia;

    public Motor(String nome, BigDecimal preco, Integer potencia) {
        this.nome = nome;
        this.preco = preco;
        this.potencia = potencia;
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

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return nome + ", Potencia: " + potencia + "cv";
    }
}
