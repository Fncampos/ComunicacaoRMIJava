package br.com.rmi.control;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmiServidorExemplo extends Remote {

    //public String exibirMensagem(String txt) throws RemoteException;
    public boolean adicionarVeiculo(String nome, String marca, int ano, double valor) throws RemoteException;
    public String buscarVeiculo(String nome) throws RemoteException;
    public boolean removerVeiculo(String nome) throws RemoteException;
   
    
}
