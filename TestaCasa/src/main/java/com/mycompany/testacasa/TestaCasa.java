/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testacasa;

import java.util.Scanner;

/**
 *
 * @author anajl
 */
public class TestaCasa {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        Porta porta1 = new Porta(false, "marrom", 0.70, 2.10, 0.2);
        Porta porta2 = new Porta(false, "branca", 0.70, 2.10, 0.2);
        Porta porta3 = new Porta(false, "preta", 0.70, 2.10, 0.2);
        
        Casa casa = new Casa(porta1, porta2, porta3, "creme");
        
        while (true) {
            String R = menuOpcoes(ler); 
            
            switch (R) {
                case "0" -> {
                    return; 
                }
                case "1" -> {
                    System.out.println("A casa possui a cor " + casa.getCor() + ". Qual cor voce deseja pintar? ");
                    String corNova = ler.nextLine(); 
                    casa.pinta(corNova); 
                }
                case "2" -> {
                    if(porta1.estaAberta() || porta2.estaAberta()||porta3.estaAberta()){
                        System.out.println("As portas abertas sao: ");
                        if (porta1.estaAberta()) { System.out.println("Porta 1"); }
                        if (porta2.estaAberta()) { System.out.println("Porta 2"); }
                        if (porta3.estaAberta()) { System.out.println("Porta 3"); }

                        System.out.println("Qual porta deseja fechar? Insira o numero.");
                        int fecharPorta = ler.nextInt();
                        ler.nextLine(); 

                        switch (fecharPorta) {
                            case 1 -> porta1.fecha();
                            case 2 -> porta2.fecha();
                            case 3 -> porta3.fecha();
                            default -> System.out.println("Valor invalido.");
                    }
                    }else{
                        System.out.println("Nao ha portas abertas");
                    }
                   
                }
                case "3" -> {
                    
                    if(!porta1.estaAberta() || !porta2.estaAberta()|| !porta3.estaAberta()){
                        System.out.println("As portas fechadas são: ");
                        if (!porta1.estaAberta()) { System.out.println("Porta 1"); }
                        if (!porta2.estaAberta()) { System.out.println("Porta 2"); }
                        if (!porta3.estaAberta()) { System.out.println("Porta 3"); }

                        System.out.println("Qual porta deseja abrir? Insira o número.");
                        int abrirPorta = ler.nextInt();
                        ler.nextLine(); 

                        switch (abrirPorta) {
                            case 1 -> porta1.abre();
                            case 2 -> porta2.abre();
                            case 3 -> porta3.abre();
                            default -> System.out.println("Valor inválido.");
                        }
                    }else{System.out.println("Nao ha portas fechadas");}
                }
                default -> System.out.println("Valor inválido");
                
            }
        }
    }
    static String menuOpcoes(Scanner ler) {
        System.out.println("\n\n\nQual operacao deseja executar? ");
        System.out.println("0 - Sair\n1 - Mudar cor da casa\n2 - Fechar porta\n3 - Abrir porta");
        return ler.nextLine(); 
    }
}
