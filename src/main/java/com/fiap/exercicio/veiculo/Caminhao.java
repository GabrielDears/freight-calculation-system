package com.fiap.exercicio.veiculo;

import com.fiap.exercicio.adapter.TabelaTaxaVeiculoPesadoLocal;
import com.fiap.exercicio.validators.CaminhaoValidator;

public class Caminhao extends VeiculoPesado {
    public Caminhao(Double distancia, TabelaTaxaVeiculoPesadoLocal tabelaTaxaVeiculoPesado, Double pesoDaCarga) {
        super(distancia, pesoDaCarga, tabelaTaxaVeiculoPesado);
        CaminhaoValidator.validarPesoCarga(pesoDaCarga);
    }

    @Override
    public Double getCustoCombustivel() {
        Double custoCombustivel = super.getCustoCombustivel();
        if (distancia < 100) {
            custoCombustivel *= 1.3;
        }
        return custoCombustivel;
    }

    @Override
    public Double getValorTransporte() {
        Double valorTransporte = super.getValorTransporte();
        if (pesoDaCarga < 50) {
            valorTransporte *= 1.2;
        }
        return valorTransporte;

    }
}
