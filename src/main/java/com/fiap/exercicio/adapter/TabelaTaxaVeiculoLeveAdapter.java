package com.fiap.exercicio.adapter;

import com.fiap.exercicio.lib.TabelaTaxaVeiculoLeve;

public class TabelaTaxaVeiculoLeveAdapter implements TabelaTaxaVeiculoLeveLocal {

    private final TabelaTaxaVeiculoLeve tabelaTaxaVeiculoLeve;

    public TabelaTaxaVeiculoLeveAdapter(TabelaTaxaVeiculoLeve tabelaTaxaVeiculoLeve) {
        this.tabelaTaxaVeiculoLeve = tabelaTaxaVeiculoLeve;
    }

    @Override
    public Double obterPorPassageiro(int quantidade) {
        return tabelaTaxaVeiculoLeve.obterPorPassageiro(quantidade);
    }

    @Override
    public Double obterPorDistanciaEmQuilometros(double km) {
        return tabelaTaxaVeiculoLeve.obterPorDistanciaEmQuilometros(km);
    }

    @Override
    public Double obterPorPesoEmQuilo(double kg) {
        return tabelaTaxaVeiculoLeve.obterPorPesoEmQuilo(kg);
    }
}
