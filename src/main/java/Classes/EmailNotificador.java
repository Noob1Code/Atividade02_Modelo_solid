/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.Notificador;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 10/03/2025
 * @brief Class EmailNotificador
 */
public class EmailNotificador implements Notificador {
    public void notificar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
