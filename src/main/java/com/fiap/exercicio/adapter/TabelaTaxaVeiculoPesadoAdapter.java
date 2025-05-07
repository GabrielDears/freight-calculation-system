package com.fiap.exercicio.adapter;

import com.fiap.exercicio.lib.TabelaTaxaVeiculoPesado;

public class TabelaTaxaVeiculoPesadoAdapter implements TabelaTaxaVeiculoPesadoLocal {

    private final TabelaTaxaVeiculoPesado tabelaTaxaVeiculoPesado;

    public TabelaTaxaVeiculoPesadoAdapter(TabelaTaxaVeiculoPesado tabelaTaxaVeiculoPesado) {
        this.tabelaTaxaVeiculoPesado = tabelaTaxaVeiculoPesado;
    }

    @Override
    public Double obterPorPassageiro(int quantidade) {
        return tabelaTaxaVeiculoPesado.obterPorPassageiro(quantidade);
    }

    @Override
    public Double obterPorDistanciaEmQuilometros(double km) {
        return tabelaTaxaVeiculoPesado.obterPorDistanciaEmQuilometros(km);
    }

    @Override
    public Double obterPorPesoEmQuilo(double kg) {
        return tabelaTaxaVeiculoPesado.obterPorPesoEmQuilo(kg);
    }
}
