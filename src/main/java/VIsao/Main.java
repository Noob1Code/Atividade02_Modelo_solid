/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package VIsao;

import Classes.DescontoClienteVip;
import Classes.EmailNotificador;
import Classes.GerenciadorBancoDeDadosMySQL;
import Classes.Pedido;
import Classes.PedidoDatabaseRepository;
import Classes.ProcessadorDePedidos;
import Interfaces.GerenciadorBancoDeDados;
import Interfaces.PedidoRepository;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class Main
 */
public class Main {
        public static void main(String[] args) {
        GerenciadorBancoDeDados bancoDeDados = new GerenciadorBancoDeDadosMySQL("admin", "1234");
        PedidoRepository pedidoRepository = new PedidoDatabaseRepository(bancoDeDados);
        
        Pedido pedido = new Pedido(100.0, new DescontoClienteVip(), new EmailNotificador());
        ProcessadorDePedidos processador = new ProcessadorDePedidos(pedidoRepository);
        processador.processar(pedido);
        
        ((PedidoDatabaseRepository) pedidoRepository).fecharConexao();
    }
}
