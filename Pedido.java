package com.mycompany.pedido;

public class Pedido {

    public static void main(String[] args) {
      
        Produto p1 = new Produto("Mouse", 100);
        Produto p2 = new Produto("Teclado", 200);

        MeuPedido pedido = new MeuPedido();
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        Cliente cliente = new Cliente("Julia", pedido);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Total do pedido: " + pedido.calcularTotal());
    }
}