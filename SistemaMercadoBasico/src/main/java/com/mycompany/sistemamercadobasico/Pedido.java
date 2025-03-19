package com.mycompany.sistemamercadobasico;

import java.util.List;

/**
 *
 * @author anajl
 */
import java.util.List;

public class Pedido {
    private final List<Produto> produtos;

    public Pedido(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void mostrarPedido() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }
}

