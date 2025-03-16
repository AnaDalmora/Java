/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testacasa;

/**
 *
 * @author anajl
 */
public class Casa {
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    private String cor;

    public Casa(Porta porta1, Porta porta2, Porta porta3, String cor) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public String getCor() {
        return cor;
    }

    public void pinta(String cor){
        this.cor = cor;
        System.out.println("Casa pintada com a cor "+this.cor);
    }
    
    public int quantasPortasEstaoAbertas(){
        int quantidade=0;
        if(porta1.estaAberta()){quantidade++;}
        if(porta2.estaAberta()){quantidade++;}
        if(porta3.estaAberta()){quantidade++;}
        return quantidade;
    }
}
