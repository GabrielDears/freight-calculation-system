package com.fiap.criacionais.abstract_factory;

public class WindowsTextbox extends Textbox {
    public WindowsTextbox(String texto) {
        super(texto);
    }

    @Override
    public String getTexto() {
        return texto;
    }
}
