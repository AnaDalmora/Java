/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamercadobasico;

/**
 *
 * @author anajl
 */
public class Pagamento implements PedidoPagamento {
    @Override
    public double calcularPagamento(Pedido pedido) {
        return pedido.calcularTotal();
    }
}
