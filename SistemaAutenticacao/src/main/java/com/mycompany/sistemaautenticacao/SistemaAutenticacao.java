/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaautenticacao;
import java.util.Scanner;
/**
 *
 * @author anajl
 */
public class SistemaAutenticacao {

    public static void main(String[] args) {
        
        String s;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a senha do sistema: ");
        s = ler.nextLine();
        Senha senha = new Senha(s);
        
        while(true){
            if(senha.tentativas == 0 ){
               System.out.println("Usuario bloqueado");
            }else{
                System.out.println("Insira a senha (0 para sair): ");
                s = ler.nextLine();
                
                if(s.equals("0")) { break; }
                
                senha.setTentativaSenha(s);
                senha.entraSenha();
            }
        }
        
    }
}
