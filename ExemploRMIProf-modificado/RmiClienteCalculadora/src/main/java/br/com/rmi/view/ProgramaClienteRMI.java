package br.com.rmi.view;
import java.rmi.Naming;

import br.com.rmi.control.IRmiServidorExemplo;
import java.io.Serializable;


 
public class ProgramaClienteRMI implements Serializable{
 
public static void main(String[] args) throws Exception{ 
        String urlServidor = "rmi://localhost/RmiServidor"; // 172.18.2.153
        IRmiServidorExemplo serv = (IRmiServidorExemplo)Naming.lookup(urlServidor);
 
        //System.out.println(serv.exibirMensagem("eu sou a msg do cliente..."));
        //System.out.println(serv.exibirMensagem("Esta´é a msg 2..."));
        
        
        serv.adicionarVeiculo("João", "Ford", 2010, 35000.0);
        System.out.println(serv.buscarVeiculo("João"));
        serv.removerVeiculo("João");
        
        
        System.out.println("Veículo adicionado com sucesso.");
        
    }
}