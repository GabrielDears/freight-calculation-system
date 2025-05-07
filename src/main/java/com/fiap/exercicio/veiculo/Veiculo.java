package com.fiap.exercicio.veiculo;

public abstract class Veiculo {
    Double distancia;

    public Veiculo(Double distancia) {
        this.distancia = distancia;
    }

    public abstract Double getCustoCombustivel();

    public abstract Double getValorTransporte();

    public Double obterValorTotal() {
        return (getCustoCombustivel() + getValorTransporte()) * distancia;
    }


}
