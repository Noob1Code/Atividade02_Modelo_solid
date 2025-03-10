/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import Interfaces.GerenciadorBancoDeDados;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 09/03/2025
 * @brief Class GerenciadorBancoDeDadosMySQL
 */
public class GerenciadorBancoDeDadosMySQL implements GerenciadorBancoDeDados {
    private boolean conectado;
    private String usuario;
    private String senha;
    
    public GerenciadorBancoDeDadosMySQL(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void conectar() {
        if (usuario.equals("admin") && senha.equals("1234")) {
            conectado = true;
            System.out.println("Conectado ao banco de dados MySQL.");
        } else {
            System.out.println("Falha na autenticação. Usuário ou senha incorretos.");
        }
    }
    
    public void desconectar() {
        if (conectado) {
            System.out.println("Desconectado do banco de dados MySQL.");
            conectado = false;
        } else {
            System.out.println("Nenhuma conexão ativa para desconectar.");
        }
    }
    
    public boolean estaConectado() {
        return conectado;
    }
}
