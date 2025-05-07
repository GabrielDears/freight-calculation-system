package com.fiap.exercicio.logger;

public class LocacaoLogger {

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
