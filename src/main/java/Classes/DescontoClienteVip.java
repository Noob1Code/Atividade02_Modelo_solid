/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.DescontoStrategy;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class DescontoClienteVip
 */
public class DescontoClienteVip implements DescontoStrategy {
    public double aplicarDesconto(double valor) {
        return valor * 0.90; 
    }
}
