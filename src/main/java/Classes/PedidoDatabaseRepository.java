/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.GerenciadorBancoDeDados;
import Interfaces.PedidoRepository;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class PedidoDatabaseRepository
 */
public class PedidoDatabaseRepository implements PedidoRepository {
    private GerenciadorBancoDeDados gerenciadorBancoDeDados;
    
    public PedidoDatabaseRepository(GerenciadorBancoDeDados gerenciadorBancoDeDados) {
        this.gerenciadorBancoDeDados = gerenciadorBancoDeDados;
        gerenciadorBancoDeDados.conectar();
    }
    
    public void salvar(Pedido pedido) {
        if (gerenciadorBancoDeDados.estaConectado()) {
            System.out.println("Pedido salvo no banco de dados.");
        } else {
            System.out.println("Erro: Não é possível salvar o pedido, banco de dados desconectado.");
        }
    }
    
    public void fecharConexao() {
        gerenciadorBancoDeDados.desconectar();
    }
}
