package com.fiap.exercicio.adapter;

public interface TabelaTaxaLocal {
    Double obterPorPassageiro(int quantidade);

    Double obterPorDistanciaEmQuilometros(
            double km);

    Double obterPorPesoEmQuilo(double kg);

}
