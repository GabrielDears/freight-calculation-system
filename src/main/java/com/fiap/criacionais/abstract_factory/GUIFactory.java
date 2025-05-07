package com.fiap.criacionais.abstract_factory;

public abstract class GUIFactory {
    public abstract Button createButton();
    public abstract Textbox createTextbox(String texto);
    public abstract Checkbox createCheckbox();

    protected void prepareForRendering(Button button) {
        button.draw();
        System.out.println("Preparing for rendering...");
    }

}
