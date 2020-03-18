package io.lfr.plr.service;

import io.lfr.plr.domain.Pedido;
import io.lfr.plr.exceptions.PedidoNotFoundException;
import io.lfr.plr.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository; // final: Na contrucao do obejto ja tem que ser inicializado e nao pode ser alterado

    public PedidoService(@Autowired PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido buscarPedido(Integer id){
        return pedidoRepository.findById(id).orElseThrow(PedidoNotFoundException::new);
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
