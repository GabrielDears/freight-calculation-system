package com.fiap.comportamentais.chain_of_responsibility;

public abstract class InputValidator {

    protected InputValidator next;

    void setNext(InputValidator next) {
        this.next = next;
    }

    public abstract void validate(String input);

}
