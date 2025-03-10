/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.PedidoRepository;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class ProcessadorDePedidos
 */
public class ProcessadorDePedidos {
    private PedidoRepository pedidoRepository;
    
    public ProcessadorDePedidos(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
    
    public void processar(Pedido pedido) {
        pedido.finalizarPedido();
        pedidoRepository.salvar(pedido);
    }
}
