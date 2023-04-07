/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author flavi
 */
public interface InterfaceClassificadoVeiculos extends Remote {
    public String addNome(String txt)throws RemoteException;
    public String addMarca(String txt)throws RemoteException;
    public String addAno(int txt)throws RemoteException;
    public String addValor(Double txt)throws RemoteException;
    //public String exibeDados()throws RemoteException;
    public String listaVeiculo()throws RemoteException;
    
}