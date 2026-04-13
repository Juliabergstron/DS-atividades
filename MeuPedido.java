package com.mycompany.pedido;

import java.util.ArrayList;

public class MeuPedido {
    
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }
}