/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.DescontoStrategy;
import Interfaces.Notificador;
import Interfaces.PedidoFactoryInterface;
import Interfaces.PedidoRepository;
import Interfaces.ProcessadorDePedidosInterface;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 10/03/2025
 * @brief Class PedidoFactory
 */
public class PedidoFactory implements PedidoFactoryInterface {
    private Notificador notificador;
    private PedidoRepository pedidoRepository;
    private DescontoStrategy descontoStrategy;

    public PedidoFactory(Notificador notificador, PedidoRepository pedidoRepository, DescontoStrategy descontoStrategy) {
        this.notificador = notificador;
        this.pedidoRepository = pedidoRepository;
        this.descontoStrategy = descontoStrategy;
    }

    @Override
    public ProcessadorDePedidosInterface criarProcessador() {
        return new ProcessadorDePedidos(notificador, pedidoRepository, descontoStrategy);
    }
}
