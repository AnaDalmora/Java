/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testacalculadoras;
import java.util.Scanner;
/**
 *
 * @author anajl
 */
public class TestaCalculadoras {

    
   
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        Scanner ler = new Scanner(System.in);
  
        while(true){
            int op = MenuOpcoes(ler);
            switch(op){
                case 0:
                    return;
                case 1:
                    System.out.println("A soma e: " +calculadora.Soma(numero(ler), numero(ler)));
                    break;
                case 2:
                    System.out.println("A subtracao e: "+calculadora.Subtracao(numero(ler), numero(ler)));
                    break;
                case 3:
                    System.out.println("A multiplicacao e: "+calculadora.Multiplicacao(numero(ler), numero(ler)));
                    break;
                case 4:
                    System.out.println("A divisao e: "+calculadora.Divisao(numero(ler), numero(ler)));
                    break;
                case 5:
                    System.out.println("A potencia e: "+calculadoraCientifica.Potencia(numero(ler), numero(ler)));
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
    private static int MenuOpcoes(Scanner ler){
        System.out.println("Qual operacao deseja realizar?\n0 - Sair\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - Potencia");
        System.out.print("-------------\nR: ");
        return ler.nextInt();
    }
    private static double numero(Scanner ler){
        System.out.println("Insira o numero: ");
        return ler.nextDouble();
    }
    
}
