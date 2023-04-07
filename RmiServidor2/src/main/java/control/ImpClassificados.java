/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.rmi.RemoteException;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author flavi
 */
public class ImpClassificados extends UnicastRemoteObject implements InterfaceClassificadoVeiculos {
    private static final long serialVersionUID = 1L;
    Veiculo veiculo = new Veiculo();
    ArrayList<Veiculo> carros = new ArrayList<>();

    public ImpClassificados() throws RemoteException {
        super();
    }
      
    @Override
    public String addNome(String txt) throws RemoteException {
        veiculo.setNome (txt);
        
        return ("Nome gravado na Class Veiculo. Recebi a msg " + txt);
    }   

    @Override
    public String addMarca(String txt) throws RemoteException {
        veiculo.setMarca(txt);
        return "Marca gravada";
    }

    @Override
    public String addAno(int txt) throws RemoteException {
        veiculo.setAno(txt);
        return "Ano gravado";
        
    }

    @Override
    public String addValor(Double txt) throws RemoteException {
        
        veiculo.setValor(txt);
        guardarVeiculo(veiculo);
        return "Valor gravado";
    }
     //public String exibeDados(){
      //   String info = "Cliente: "+this.nome+ "\nMarca: "+this.marca+"\nAno: "+Integer.toString(this.ano)+"\nValor: R$"+Double.toString(this.Valor);
        // return info;
     //}
     public String listaVeiculo(){
         StringBuilder carroList = new StringBuilder("lista de carros:");
         for(Veiculo carro:carros){
            String info = "Cliente: "+carro.getNome()+ "\nMarca: "+carro.getMarca()+"\nAno: "+Integer.toString(carro.getAno())+"\nValor: R$"+Double.toString(carro.getValor());
           carroList.append("\n").append(info);
         }
         return carroList.toString();
     }
 
     //public void guadarVeiculo(Veiculo veiculo){
        // carros.add(veiculo);
     //}

    private void guardarVeiculo(Veiculo aThis) {
         carros.add(aThis);
        
    }
    
}
