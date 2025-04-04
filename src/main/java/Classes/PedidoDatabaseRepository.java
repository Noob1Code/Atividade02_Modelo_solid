/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.PedidoRepository;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 10/03/2025
 * @brief Class PedidoDatabaseRepository
 */
public class PedidoDatabaseRepository implements PedidoRepository {
    public void salvarPedido(Pedido pedido) {
        System.out.println("Pedido salvo no banco de dados com valor: " + pedido.getValor());
    }
}
