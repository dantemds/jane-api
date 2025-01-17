package br.com.muralis.core.domain.exception;

import io.quarkus.logging.Log;

public class ColaboradorCadastradoComEmail extends DomainException {

    public ColaboradorCadastradoComEmail(String email) {
        super("Já existe um colaborador cadastrado com o email " + email, 400);
        Log.error("Já existe um colaborador cadastrado com o email " + email);
    }

}
