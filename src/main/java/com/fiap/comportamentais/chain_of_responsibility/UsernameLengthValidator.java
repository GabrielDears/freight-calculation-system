package com.fiap.comportamentais.chain_of_responsibility;

public class UsernameLengthValidator extends InputValidator {
    @Override
    public void validate(String input) {
        if (input.length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters long");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}
