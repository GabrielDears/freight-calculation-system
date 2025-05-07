package com.fiap.criacionais.abstract_factory;

public class WindowsFactory extends GUIFactory {
    @Override
    public Button createButton() {
        WindowsButton windowsButton = new WindowsButton();
        prepareForRendering(windowsButton);
        return windowsButton;
    }

    @Override
    public Textbox createTextbox(String texto) {
        return new WindowsTextbox(texto);
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
