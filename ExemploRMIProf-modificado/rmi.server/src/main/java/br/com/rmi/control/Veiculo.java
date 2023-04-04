/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rmi.control;

import java.util.List;

/**
 *
 * @author flavi
 */
public class Veiculo {
    private String nomeDoCliente;
    private String marca;
    private Integer anoDeFabricacao;
    private double valor;

    public Veiculo(String nomeDoCliente, String marca, int anoDeFabricacao, double valor) {
        this.nomeDoCliente = nomeDoCliente;
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.valor = valor;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoDeFabricacao() {
        String ano = this.anoDeFabricacao.toString();
        return ano;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
       
   
}
