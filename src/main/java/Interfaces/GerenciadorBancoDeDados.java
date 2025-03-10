/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Interfaces;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class GerenciadorBancoDeDados
 */
public interface GerenciadorBancoDeDados {
    void conectar();
    void desconectar();
    boolean estaConectado();
}
