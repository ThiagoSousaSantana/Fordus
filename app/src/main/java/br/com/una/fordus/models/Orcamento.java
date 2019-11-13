package br.com.una.fordus.models;

import java.io.Serializable;

public class Orcamento implements Serializable {

    private Cliente cliente;
    private Motor motor;
    private Direcao direcao;
    private Suspencao suspencao;

    public Orcamento(Cliente cliente, Motor motor, Direcao direcao, Suspencao suspencao) {
        this.cliente = cliente;
        this.motor = motor;
        this.direcao = direcao;
        this.suspencao = suspencao;
    }

    public Motor getMotor() {
        return motor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public Suspencao getSuspencao() {
        return suspencao;
    }

    public void setSuspencao(Suspencao suspencao) {
        this.suspencao = suspencao;
    }
}
