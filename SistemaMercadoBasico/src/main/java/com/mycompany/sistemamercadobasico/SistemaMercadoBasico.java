/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemamercadobasico;

import java.util.Scanner;

/**
 *
 * @author anajl
 */
public class SistemaMercadoBasico {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Produto produto01 = new Produto("Refrigerante", 5);
        Produto produto02 = new Produto("Pao de Queijo", 4);
        Produto produto03 = new Produto("Hamburguer", 12);
        Produto produto04 = new Produto("Coxinha", 3);
        Produto produto05 = new Produto("Salgado de Carne",4 );
        Produto produto06 = new Produto("Batata Frita", 6);
        Produto produto07 = new Produto("Suco Natural", 5);
        Produto produto08 = new Produto("Pastel", 6);
        Produto produto09 = new Produto("Milkshake", 12);
        Produto produto10 = new Produto("Pizza", 25);
       
        System.out.println("Produtos disponiveis:");
        System.out.println("1 - " + produto01.getNome() + " - R$ " + produto01.getPreco());
        System.out.println("2 - " + produto02.getNome() + " - R$ " + produto02.getPreco());
        System.out.println("3 - " +produto03.getNome() + " - R$ " + produto03.getPreco());
        System.out.println("4 - " +produto04.getNome() + " - R$ " + produto04.getPreco());
        System.out.println("5 - " +produto05.getNome() + " - R$ " + produto05.getPreco());
        System.out.println("6 - " +produto06.getNome() + " - R$ " + produto06.getPreco());
        System.out.println("7 - " +produto07.getNome() + " - R$ " + produto07.getPreco());
        System.out.println("8 - " +produto08.getNome() + " - R$ " + produto08.getPreco());
        System.out.println("9 - " +produto09.getNome() + " - R$ " + produto09.getPreco());
        System.out.println("10 - " +produto10.getNome() + " - R$ " + produto10.getPreco());
        Pedido pedido = new Pedido(1);
        while(true){
            System.out.println("Qual item voce deseja adicionar em seu pedido? (0 para sair)");
            int resposta = scanner.nextInt();
            if(resposta == 0){
                pedido.exibirPedido();
                break;
            }
            switch(resposta){
                case 1: 
                    pedido.adicionarItem(produto01);
                    break;
                case 2:
                    pedido.adicionarItem(produto02);
                    break;
                case 3:
                    pedido.adicionarItem(produto03);
                    break;
                case 4:
                    pedido.adicionarItem(produto04);
                    break;
                case 5:
                    pedido.adicionarItem(produto05);
                    break;
                case 6:
                    pedido.adicionarItem(produto06);
                    break;
                case 7:
                    pedido.adicionarItem(produto07);
                    break;
                case 8:
                    pedido.adicionarItem(produto08);
                    break;
                case 9:
                    pedido.adicionarItem(produto09);
                    break;
                case 10:
                    pedido.adicionarItem(produto10);
                    break;
                default:
                    System.out.println("Produto inválido.");
            }
            
        }
        
        
       
        
       
       
    }
    private void exibirPedidos(){

    }
}
