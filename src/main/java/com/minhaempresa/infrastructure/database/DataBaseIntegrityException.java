package com.minhaempresa.infrastructure.database;

/*
    Essa classe mantém a integridade do banco de dados, impedido
    que seja apagdo registro de pedido já realizado.
 */

public class DataBaseIntegrityException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataBaseIntegrityException(String msg) {
        super(msg);
    }
}
