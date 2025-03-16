/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testacasa;

/**
 *
 * @author anajl
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public String getCor() {
        return cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void abre(){
        aberta = true;
        System.out.println("Porta aberta");
    }
    public void fecha(){
        aberta = false;
        System.out.println("Porta fechada");
    }
    public void pinta(String cor){
        this.cor = cor;
        System.out.println("Parede pintada com a cor " + this.cor);
    }
    
    public boolean estaAberta(){
        return aberta;
    }
}
