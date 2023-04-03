/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.classificadosserver2;

import java.rmi.RemoteException;
import java.rmi.Remote;
/**
 *
 * @author flavi
 */
public interface ClassificadosVeiculo extends Remote{
    public String exibirMensagem(String txt) throws RemoteException;
    
}
