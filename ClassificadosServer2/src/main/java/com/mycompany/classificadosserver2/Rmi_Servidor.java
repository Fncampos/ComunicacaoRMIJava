/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classificadosserver2;

import java.rmi.Naming;

import java.rmi.registry.LocateRegistry;

/**
 *
 * @author flavi
 */
public class Rmi_Servidor {
    public static void main (String[] args) throws Exception{
        ListaDeVeiculos serv = new ListaDeVeiculos();
       
        LocateRegistry.createRegistry(1099);
        
        Naming.bind("Servidor", serv);
        
        System.out.println("***Servidor Ligado***");
        System.out.println();
    }
}
