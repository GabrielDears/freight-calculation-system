package com.fiap.criacionais.abstract_factory;

public class MacFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Textbox createTextbox(String texto) {
        return new MacTextbox(texto);
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
