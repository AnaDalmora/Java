/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautenticacao;

import java.util.Scanner;

/**
 *
 * @author anajl
 */
public class Senha {
    
    private String senhaCorreta;
    private String tentativaSenha;
    public int tentativas = 3;
    Scanner ler = new Scanner(System.in);
 
    public Senha(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    public String getSenhaCorreta() {
        return senhaCorreta;
    }

    public void setTentativaSenha(String tentativaSenha) {
        this.tentativaSenha = tentativaSenha;
    }

    public void entraSenha() {
        if (tentativas == 0) {
            System.out.println("Acesso bloqueado.");
        } else if (tentativaSenha.equals(senhaCorreta)) {  
            System.out.println("Senha correta, acesso liberado.");
            System.out.println("Desenha alterar a senha? (S/N)");
                
            if(ler.nextLine().equals("S")){
                trocarSenha();
            }
            this.tentativas = 3; 
        } else {
            this.tentativas--;
            System.out.println("Senha incorreta, voce tem mais " + this.tentativas + " tentativas.");
        }
    }
    public void trocarSenha(){
        System.out.println("Insira a senha antiga: ");
        String senhaAntiga = ler.nextLine();
        if(senhaAntiga.equals(senhaCorreta)){
            System.out.println("Insira a nova senha: ");
            String senhaNova = ler.nextLine();
            this.senhaCorreta = senhaNova;
            System.out.println("Senha alterada.");
        }else{
            System.out.println("Senha incorreta, operação cancelada.");
        }
    
    }

}