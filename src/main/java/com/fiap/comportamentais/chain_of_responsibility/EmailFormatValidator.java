package com.fiap.comportamentais.chain_of_responsibility;

public class EmailFormatValidator extends InputValidator {
    @Override
    public void validate(String input) {
        if (!input.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}
