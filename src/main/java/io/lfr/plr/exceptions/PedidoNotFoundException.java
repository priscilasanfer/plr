package io.lfr.plr.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PedidoNotFoundException extends RuntimeException {

    public PedidoNotFoundException(){
        super("O pedido não foi encontrado");

    }

}
