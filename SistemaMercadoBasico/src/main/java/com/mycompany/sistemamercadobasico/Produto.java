/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamercadobasico;

/**
 *
 * @author anajl
 */
class Produto {
    public String nomeProduto;
    public float preco;
    
    public Produto(String nomeProduto, float preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }
    
    public String getNome() {
        return nomeProduto;
    }

    public float getPreco() {
        return preco;
    }
}
