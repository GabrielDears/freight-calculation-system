package com.fiap.exercicio.veiculo;

import com.fiap.exercicio.adapter.TabelaTaxaVeiculoPesadoLocal;

public abstract class VeiculoPesado extends Veiculo {

    final Double pesoDaCarga;
    private final TabelaTaxaVeiculoPesadoLocal tabelaTaxaVeiculoPesado;

    public VeiculoPesado(Double distancia, Double pesoDaCarga, TabelaTaxaVeiculoPesadoLocal tabelaTaxaVeiculoPesado) {
        super(distancia);
        this.pesoDaCarga = pesoDaCarga;
        this.tabelaTaxaVeiculoPesado = tabelaTaxaVeiculoPesado;
    }

    @Override
    public Double getCustoCombustivel() {
        return tabelaTaxaVeiculoPesado.obterPorDistanciaEmQuilometros(distancia);
    }

    @Override
    public Double getValorTransporte() {
        return tabelaTaxaVeiculoPesado.obterPorPesoEmQuilo(pesoDaCarga);
    }

}
