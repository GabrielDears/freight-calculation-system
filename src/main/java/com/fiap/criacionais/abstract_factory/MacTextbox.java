package com.fiap.criacionais.abstract_factory;

public class MacTextbox extends Textbox {
    public MacTextbox(String texto) {
        super(texto);
    }

    @Override
    public String getTexto() {
        return texto;
    }
}
