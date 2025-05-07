package com.fiap.exercicio.logger;

import java.util.logging.Logger;

public class LocacaoLogger {

    private static final Logger logger = Logger.getLogger(LocacaoLogger.class.getName());

    private static LocacaoLogger locacaoLogger;

    public static synchronized LocacaoLogger getInstancia() {
        if (locacaoLogger == null) {
            locacaoLogger = new LocacaoLogger();
        }
        return locacaoLogger;
    }

    public void logarLocacao(String msg) {
        System.out.println(msg);
    }

}
