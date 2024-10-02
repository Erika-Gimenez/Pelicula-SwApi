package com.cursoalura.peliculasswapi.excepciones;

public class ErrorEnPeticionNullException extends RuntimeException {

    public ErrorEnPeticionNullException(String message) {
        super(message);
    }
}
