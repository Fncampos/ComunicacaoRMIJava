/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classificadoveiculo2;

/**
 *
 * @author flavi
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaDeVeiculos {
    private ArrayList<Veiculo> veiculos;
    
    public ListaDeVeiculos() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o ano de fabricação do veículo: ");
        int anoDeFabricacao = scanner.nextInt();
        scanner.nextLine(); // Consumir o newline deixado pelo nextInt()

        System.out.print("Digite o valor do veículo: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir o newline deixado pelo nextDouble()

        Veiculo veiculo = new Veiculo(nomeDoCliente, marca, anoDeFabricacao, valor);
        veiculos.add(veiculo);

        System.out.println("Veículo adicionado com sucesso.");
    }
    public void encontrarVeiculo(String ano) {
        boolean encontrado = false;
        
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getAnoDeFabricacao().equalsIgnoreCase(ano)) {
                System.out.println("Veículo encontrado:");
                System.out.println("Nome do cliente: " + veiculo.getNomeDoCliente());
                System.out.println("Marca do veículo: " + veiculo.getMarca());
                System.out.println("Ano de fabricação do veículo: " + veiculo.getAnoDeFabricacao());
                System.out.println("Valor do veículo: " + veiculo.getValor());
                System.out.println("--------------------");

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum veículo da marca " + ano + " foi encontrado na lista.");
        }
    }
    public void removerVeiculo(String marca, String nomeDoCliente) {
        boolean removido = false;

        for (Iterator<Veiculo> iterator = veiculos.iterator(); iterator.hasNext();) {
            Veiculo veiculo = iterator.next();

            if (veiculo.getMarca().equalsIgnoreCase(marca) && veiculo.getNomeDoCliente().equalsIgnoreCase(nomeDoCliente)) {
                iterator.remove();
                System.out.println("Veículo removido com sucesso.");
                removido = true;
            }
        }

        if (!removido) {
            System.out.println("Nenhum veículo foi encontrado com a marca " + marca + " e nome do cliente " + nomeDoCliente + ".");
        }
    }
    public void imprimirListaDeVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("A lista de veículos está vazia.");
        } else {
            System.out.println("Lista de veículos:");
            for (Veiculo veiculo : veiculos) {
                System.out.println("Nome do cliente: " + veiculo.getNomeDoCliente());
                System.out.println("Marca do veículo: " + veiculo.getMarca());
                System.out.println("Ano de fabricação do veículo: " + veiculo.getAnoDeFabricacao());
                System.out.println("Valor do veículo: " + veiculo.getValor());
                System.out.println("--------------------");
            }
        }
    }
}