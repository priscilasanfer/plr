package io.lfr.plr.controller;

import io.lfr.plr.domain.Pedido;
import io.lfr.plr.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {


    private final PedidoService pedidoService;

    public PedidoController(@Autowired PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/{id}")
    public Pedido getPedido(@PathVariable("id") Integer id) {
        return pedidoService.buscarPedido(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido postPedido(@RequestBody Pedido pedido){
        return pedidoService.criarPedido(pedido);
    }
}
