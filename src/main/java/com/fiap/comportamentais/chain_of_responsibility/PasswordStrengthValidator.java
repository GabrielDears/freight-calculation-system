package com.fiap.comportamentais.chain_of_responsibility;

public class PasswordStrengthValidator extends InputValidator {
    @Override
    public void validate(String input) {
        if (input.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}
