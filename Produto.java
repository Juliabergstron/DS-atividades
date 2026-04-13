package com.mycompany.produto;

public class Produto {

    public static void main(String[] args) {

        metodoProduto produto = new metodoProduto("Doce", 10.00);

        System.out.println("Produto: " + produto.getNome() 
        + " | Preço: " + produto.getPreco());

        // aplicando desconto
        produto.aplicarDesconto(10);

        System.out.println("Com desconto: " + produto.getPreco());
    }
}