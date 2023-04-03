/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadoscliente;

import java.rmi.Naming;

/**
 *
 * @author flavi
 */
public class Cliente {

    public static void main(String[] args) throws Exception{ 
            String urlServidor = "rmi://localhost/Servidor:1099"; 
            System.out.println("???1");
            ClassificadosVeiculo serv = (ClassificadosVeiculo)Naming.lookup(urlServidor);

            System.out.println(serv.exibirMensagem("Eu sou a msg do cliente"));
}
}
