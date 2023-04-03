/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classificadosserver2;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.rmi.RemoteException;
import java.util.LinkedList;


/**
 *
 * @author flavi
 */
public class ListaDeVeiculos extends UnicastRemoteObject implements ClassificadosVeiculo{
    private static final long serialVersionUID = 1L;
    //List<String>veiculo;
    
    protected ListaDeVeiculos() throws RemoteException{
        super();
        //this.veiculo = new LinkedList<String>();
    }
    
    @Override
    public String exibirMensagem(String txt) throws RemoteException{
        //String hist ="";
        //for(String h : this.veiculo){ hist = hist +"\n";}
        System.out.println("Mensagem do Cliente = "+txt );
        
        return "Retorno RMI: " + txt.toUpperCase();
    }
    
}
