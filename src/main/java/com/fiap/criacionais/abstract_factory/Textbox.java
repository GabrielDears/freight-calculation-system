package com.fiap.criacionais.abstract_factory;

public abstract class Textbox {

    protected final String texto;

    public Textbox(String texto) {
        this.texto = texto;
    }

    public abstract String getTexto();

}
