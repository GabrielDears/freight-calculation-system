package com.fiap.exercicio.veiculo;

import com.fiap.exercicio.adapter.TabelaTaxaVeiculoLeveLocal;

public class Bicicleta extends VeiculoLeve {
    public Bicicleta(Double distancia, TabelaTaxaVeiculoLeveLocal tabelaTaxaVeiculoLeve) {
        super(distancia, 1, tabelaTaxaVeiculoLeve);
    }

    @Override
    public Double getCustoCombustivel() {
        return 0.0;
    }

    @Override
    public Double getValorTransporte() {
        return super.getValorTransporte() * 0.8;
    }

}
