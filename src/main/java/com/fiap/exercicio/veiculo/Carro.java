package com.fiap.exercicio.veiculo;

import com.fiap.exercicio.adapter.TabelaTaxaVeiculoLeveLocal;
import com.fiap.exercicio.validators.CarroValidator;

public class Carro extends VeiculoLeve {
    public Carro(Double distancia, TabelaTaxaVeiculoLeveLocal tabelaTaxaVeiculoLeve, Integer quantidadeDePassageiros) {
        super(distancia, quantidadeDePassageiros, tabelaTaxaVeiculoLeve);
        CarroValidator.validarQuantidadePassageiros(quantidadeDePassageiros);
    }
}
