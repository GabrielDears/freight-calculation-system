package com.fiap.criacionais.singleton;

import java.time.LocalDateTime;

public class Logger {

    private static Logger LOGGER;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (LOGGER == null) {
            LOGGER = new Logger();
        }

        System.out.println(LOGGER);

        return LOGGER;
    }

    public void log(String msg) {
        System.out.printf("%s. %s%n", msg, LocalDateTime.now());
    }


}
