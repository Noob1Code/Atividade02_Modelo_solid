/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package VIsao;

import Classes.DescontoClienteVip;
import Classes.EmailNotificador;
import Classes.Pedido;
import Classes.PedidoDatabaseRepository;
import Classes.PedidoFactory;
import Classes.WhatsAppNotificador;
import Interfaces.PedidoFactoryInterface;
import Interfaces.ProcessadorDePedidosInterface;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 10/03/2025
 * @brief Class Main
 */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100);

        PedidoFactoryInterface factoryEmail = new PedidoFactory(new EmailNotificador(), new PedidoDatabaseRepository(), new DescontoClienteVip());
        ProcessadorDePedidosInterface processadorEmail = factoryEmail.criarProcessador();
        processadorEmail.processar(pedido);

        PedidoFactoryInterface factoryWhatsApp = new PedidoFactory(new WhatsAppNotificador(), new PedidoDatabaseRepository(), new DescontoClienteVip());
        ProcessadorDePedidosInterface processadorWhatsApp = factoryWhatsApp.criarProcessador();
        processadorWhatsApp.processar(pedido);
    }
}
