package com.fiap.criacionais.abstract_factory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        Textbox textbox = factory.createTextbox("TEXTO");
        Checkbox checkbox = factory.createCheckbox();
        Button button = factory.createButton();

        executeActions(button, textbox, checkbox);

        factory = new WindowsFactory();
        textbox = factory.createTextbox("TEXTO");
        checkbox = factory.createCheckbox();
        button = factory.createButton();

        executeActions(button, textbox, checkbox);
    }

    private static void executeActions(Button button, Textbox textbox, Checkbox checkbox) {
        button.click();
        button.draw();
        String text = textbox.getTexto();
        System.out.println(text);
        checkbox.check();
        String name = checkbox.getName();
        System.out.println(name);
    }

}
