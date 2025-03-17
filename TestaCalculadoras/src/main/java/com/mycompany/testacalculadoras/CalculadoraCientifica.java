/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testacalculadoras;

/**
 *
 * @author anajl
 */
public class CalculadoraCientifica extends Calculadora {
    public double Potencia(double numeroA, double numeroB){
        double pot=0;
        for(int i=0;i<numeroB;i++){
            pot += Multiplicacao(numeroA,numeroA);
        }
        return pot;
    }
}
