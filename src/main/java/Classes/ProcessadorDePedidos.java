/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.DescontoStrategy;
import Interfaces.Notificador;
import Interfaces.PedidoRepository;
import Interfaces.ProcessadorDePedidosInterface;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 10/03/2025
 * @brief Class ProcessadorDePedidos
 */
public class ProcessadorDePedidos implements ProcessadorDePedidosInterface {
    private Notificador notificador;
    private PedidoRepository pedidoRepository;
    private DescontoStrategy descontoStrategy;

    public ProcessadorDePedidos(Notificador notificador, PedidoRepository pedidoRepository, DescontoStrategy descontoStrategy) {
        this.notificador = notificador;
        this.pedidoRepository = pedidoRepository;
        this.descontoStrategy = descontoStrategy;
    }

    @Override
    public void processar(Pedido pedido) {
        double valorFinal = pedido.getValor() - descontoStrategy.calcularDesconto(pedido.getValor());
        System.out.println("Pedido processado com valor final: " + valorFinal);
        pedidoRepository.salvarPedido(pedido);
        notificador.notificar("Pedido processado com sucesso!");
    }
}
