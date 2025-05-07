package com.fiap.exercicio.validators;

import com.fiap.exercicio.logger.LocacaoLogger;

public class CaminhaoValidator {

    public static void validarPesoCarga(Double pesoDaCarga) {
        if (pesoDaCarga < 1 || pesoDaCarga > 300) {
            LocacaoLogger.getInstancia().logarLocacao("Peso da carga deve estar entre 1 e 300 kg");
            throw new IllegalArgumentException("Peso da carga deve estar entre 1 e 300 kg");
        }
    }

}
