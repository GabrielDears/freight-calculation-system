package com.fiap.exercicio.veiculo;

import com.fiap.exercicio.adapter.TabelaTaxaVeiculoLeveLocal;

public abstract class VeiculoLeve extends Veiculo {

    private final Integer quantidadeDePassageiros;
    private final TabelaTaxaVeiculoLeveLocal tabelaTaxaVeiculoLeve;

    public VeiculoLeve(Double distancia, Integer quantidadeDePassageiros, TabelaTaxaVeiculoLeveLocal tabelaTaxaVeiculoLeve) {
        super(distancia);
        this.quantidadeDePassageiros = quantidadeDePassageiros;
        this.tabelaTaxaVeiculoLeve = tabelaTaxaVeiculoLeve;
    }

    public Double getCustoCombustivel() {
        return tabelaTaxaVeiculoLeve.obterPorDistanciaEmQuilometros(distancia);
    }

    @Override
    public Double getValorTransporte() {
        return tabelaTaxaVeiculoLeve.obterPorPassageiro(quantidadeDePassageiros);
    }

}
