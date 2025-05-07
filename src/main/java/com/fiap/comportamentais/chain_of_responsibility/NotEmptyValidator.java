package com.fiap.comportamentais.chain_of_responsibility;

public class NotEmptyValidator extends InputValidator {
    @Override
    public void validate(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}
