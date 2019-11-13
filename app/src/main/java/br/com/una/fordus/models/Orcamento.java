package br.com.una.fordus.models;

public class Orcamento {

    private Motor motor;
    private Direcao direcao;
    private Suspencao suspencao;


    public Motor getMotor() {
        return motor;
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
