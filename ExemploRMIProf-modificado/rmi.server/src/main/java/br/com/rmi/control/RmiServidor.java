package br.com.rmi.control;
import java.rmi.Naming;
//import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
 
public class RmiServidor {
 
    public static void main(String[] args) throws Exception{ 
        // PORTA PADRÃO DO RMI 1099
        LocateRegistry.createRegistry(1099);
 
        // Instancia o Objeto do Servidor Remoto
        RmiServidorExemplo serv = new RmiServidorExemplo();
       
        
                // Vincula um nome para o objeto Remoto
        Naming.bind("RmiServidor", serv);
       
        
        System.out.println("RmiServidor Conectado !!!");
    }
}