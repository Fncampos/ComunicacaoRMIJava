package br.com.rmi.control;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RmiServidorExemplo extends
     UnicastRemoteObject implements IRmiServidorExemplo {
	private static final long serialVersionUID = 1L;
	private ArrayList<Veiculo> veiculos;
    protected RmiServidorExemplo() throws RemoteException {
        super();
        }

   /* public String exibirMensagem(String txt) throws RemoteException {
        String hist = "";
        System.out.println("O cliente enviou  a msg = " + txt);
        for (Veiculo h:  this.veiculos) {
           hist = hist + "\n";
          
        }
        return "Retorno RMI : " + txt.toUpperCase() + "\n "+hist;
        
    }*/

    @Override
    public boolean adicionarVeiculo(String nome, String marca, int ano, double valor) throws RemoteException {
        Veiculo veiculo = new Veiculo(nome, marca, ano, valor);
        return veiculos.add(veiculo);
    }

    @Override
    public String buscarVeiculo(String nome) throws RemoteException {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getNome().equals(nome)) {
                return veiculo.toString();
            }
        }
        return "Veículo não encontrado";
    }

    @Override
    public boolean removerVeiculo(String nome) throws RemoteException {
        Iterator<Veiculo> iterator = veiculos.iterator();
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            if (veiculo.getNome().equals(nome)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    
    
}
