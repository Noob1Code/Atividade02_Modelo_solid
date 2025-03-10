/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.DescontoStrategy;
import Interfaces.Notificador;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class Pedido
 */
public class Pedido {
    private double valor;
    private DescontoStrategy descontoStrategy;
    private Notificador notificador;
    
    public Pedido(double valor, DescontoStrategy descontoStrategy, Notificador notificador) {
        this.valor = valor;
        this.descontoStrategy = descontoStrategy;
        this.notificador = notificador;
    }
    
    public double calcularTotal() {
        return descontoStrategy.aplicarDesconto(valor);
    }
    
    public void finalizarPedido() {
        notificador.notificar("Pedido concluído. Total: " + calcularTotal());
    }
}
