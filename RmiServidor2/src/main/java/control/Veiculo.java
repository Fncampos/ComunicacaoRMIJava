/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.rmi.RemoteException;



/**
 *
 * @author flavi
 */
public class Veiculo{
    
    String nome;
    String marca;
    int ano;
    double Valor;
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return Valor;
    }
    
    
    
     
}

     
     
   