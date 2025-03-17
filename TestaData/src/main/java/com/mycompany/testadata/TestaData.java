/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testadata;

import java.util.Scanner;

/**
 *
 * @author anajll
 */

public class TestaData {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o dia: ");
        int dia = ler.nextInt();
        System.out.println("Insira o mes: ");
        int mes = ler.nextInt();
        System.out.println("Insira o ano: ");
        int ano = ler.nextInt();
        
        Data data = new Data(dia, mes, ano);
        
        data.exibirData();
        System.out.println("Deseja ver o proximo dia? (S/N)");
        
        while (true) {
            String resp = ler.nextLine().toUpperCase();
            if (resp.equals("S")) {
                data.proximoDia();
                data.exibirData();
                break;
            } else if (resp.equals("N")) {
                break;
            }
        }
       
    }
}

    