/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemamercadobasico;

/**
 *
 * @author anajl
 */
public class SistemaMercadoBasico {

    public static void main(String[] args) {
        // Criando os produtos
        Produto p1 = new Produto("Hamburguer", 15.0);
        Produto p2 = new Produto("Batata Frita", 7.0);

        // Operação que gerencia os produtos
        Operacao operacao = new Operacao();

        // Adicionando os produtos ao pedido
        operacao.adicionarProduto(p1);
        operacao.adicionarProduto(p2);

        // Finalizando o pedido
        Pedido pedido = operacao.finalizarPedido();
        pedido.mostrarPedido();

        // Calculando o pagamento do pedido
        Pagamento pagamento = new Pagamento();
        double total = pagamento.calcularPagamento(pedido);
        System.out.println("Total do Pedido: R$ " + total);
    }
}
