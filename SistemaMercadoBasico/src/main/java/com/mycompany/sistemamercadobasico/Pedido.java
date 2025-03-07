package com.mycompany.sistemamercadobasico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anajl
 */
class Pedido {
    
    public int numeroPedido;
    public List<Produto> itens;
    
    public Pedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(Produto produto){
        this.itens.add(produto);
    }
    
    public void exibirPedido(){
        System.out.println("Pedido #"+this.numeroPedido);
        System.out.println("Itens pedidos:");
        for (Produto produto : itens){
            System.out.println("- "+ produto.nomeProduto + " R$ "+ produto.preco );
        }
        System.out.println("Valor total da compra: "+ totalPedido());
    }
    public float totalPedido(){
        float total =0;
        
        for(Produto produto : itens){
            total += produto.preco;
        }
        return total;
    }
}
