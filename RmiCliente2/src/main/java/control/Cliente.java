/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;



/**
 *
 * @author flavi
 */
public class Cliente {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException{
        String url= "rmi://localhost/RMIclassificados";
        InterfaceClassificadoVeiculos serv = (InterfaceClassificadoVeiculos)Naming.lookup(url);
        
        Scanner scan = new Scanner(System.in);
        //System.out.println(serv.addNome("Flavia"));
        
        System.out.println("Digite o Nome do cliente: ");
        String txt = scan.nextLine();
        System.out.println(serv.addNome(txt));
        System.out.println("Digite a marca do Veiculo: ");
        System.out.println(serv.addMarca(scan.nextLine()));
        System.out.println("Digite o ano do Veiculo: ");
        System.out.println(serv.addAno(scan.nextInt()));
        System.out.println("Digite o Valor do Veiculo: ");
        System.out.println(serv.addValor(scan.nextDouble()));
        
        System.out.println(serv.listaVeiculo());
    } 
}
