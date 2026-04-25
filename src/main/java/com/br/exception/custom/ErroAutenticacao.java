package com.br.exception.custom;

 public class ErroAutenticacao extends RuntimeException {

    public ErroAutenticacao(String message) {
        super(message);
    }
}
