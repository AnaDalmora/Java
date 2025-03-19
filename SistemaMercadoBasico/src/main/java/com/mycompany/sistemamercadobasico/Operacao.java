/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamercadobasico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anajl
 */
public class Operacao implements ProdutoOperacao {
    private List<Produto> produtos;

    public Operacao() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public Pedido finalizarPedido() {
        return new Pedido(produtos);
    }
}
