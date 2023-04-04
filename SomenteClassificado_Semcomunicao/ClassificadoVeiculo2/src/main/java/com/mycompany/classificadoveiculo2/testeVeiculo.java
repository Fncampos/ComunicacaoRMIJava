/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classificadoveiculo2;

import com.mycompany.classificadoveiculo2.ListaDeVeiculos;
import java.util.Scanner;

/**
 *
 * @author flavi
 */
public class testeVeiculo {
    public static void main (String[] args){
        ListaDeVeiculos obj1 = new ListaDeVeiculos();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        boolean condicao = true;
        String cliente;
        String marca, ano;
        int opcao = 0;
        System.out.println("***************************************************");
        System.out.println("******Bem vindo 'Ao Classificados de Veículos'*****");
        System.out.println("***************************************************");
        while(condicao){
            System.out.println("");
            System.out.println("");
            System.out.println("------------------------------------------------------------");
            System.out.println("----------------------------- MENU -------------------------");
            System.out.println("------------------------------------------------------------");
            System.out.println("Digite o numero correspondente a opção desejada: \n"
                    + "1 - Ver lista\n"
                    + "2 - Adicionar veículo\n"
                    + "3 - Remover veiculo da lista\n"
                    + "4 - Procurar veículo pelo ano\n");
             System.out.println("------------------------------------------------------------\n");
            opcao = scan.nextInt();
            //System.out.println(opcao);
            switch(opcao) {
                case 1:
                    obj1.imprimirListaDeVeiculos();
                    break;
                case 2:
                    obj1.adicionarVeiculo();
                    break;
                case 3:
                    System.out.println("Digite Nome do Cliente: ");
                    cliente = scan1.nextLine();
                    System.out.println("Digite marca do veiculo: ");
                    marca = scan2.nextLine();
                    obj1.removerVeiculo(marca,cliente);
                    break;
                case 4:
                    System.out.println("Digite ano do veiculo: ");
                    ano = scan.nextLine();
                    obj1.encontrarVeiculo(ano);
                    break;
                case 5:
                    System.out.println("Sistema finalizado");
                    condicao = false;
                    break;
                }
        }
    }
}