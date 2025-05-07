package com.fiap.comportamentais.chain_of_responsibility;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        InputValidator notEmptyValidator = new NotEmptyValidator();
        InputValidator passwordStrengthValidator = new PasswordStrengthValidator();
        InputValidator usernameLengthValidator = new UsernameLengthValidator();
        InputValidator emailFormatValidator = new EmailFormatValidator();
        notEmptyValidator.setNext(passwordStrengthValidator);
        passwordStrengthValidator.setNext(usernameLengthValidator);
        usernameLengthValidator.setNext(emailFormatValidator);
        notEmptyValidator.validate("TESTETETETETETET@TESTE.COM");
    }

}
