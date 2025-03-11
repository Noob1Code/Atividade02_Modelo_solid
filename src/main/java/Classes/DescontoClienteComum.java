/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.DescontoStrategy;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 10/03/2025
 * @brief Class DescontoClienteComum
 */
public class DescontoClienteComum implements DescontoStrategy {
    public double calcularDesconto(double valor) {
        return valor * 0.05;
    }
}
