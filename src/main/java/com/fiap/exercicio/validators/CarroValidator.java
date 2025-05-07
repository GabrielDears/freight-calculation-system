package com.fiap.exercicio.validators;

import com.fiap.exercicio.logger.LocacaoLogger;

public class CarroValidator {

    public static void validarQuantidadePassageiros(Integer quantidadeDePassageiros) {
        if (quantidadeDePassageiros < 1 || quantidadeDePassageiros > 4) {
            LocacaoLogger.getInstancia().logarLocacao("Quantidade de passageiros deve estar entre 1 e 4");
            throw new IllegalArgumentException("Quantidade de passageiros deve estar entre 1 e 4");
        }
    }

}
