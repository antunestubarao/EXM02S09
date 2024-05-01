package com.senai.imobiliaria.exception;

public class RegistroJaExistenteException extends RuntimeException {

    public RegistroJaExistenteException(String mensagem) {
        super(mensagem);
    }

}
