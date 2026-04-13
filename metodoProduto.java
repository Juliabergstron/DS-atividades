
package com.mycompany.produto;

public class metodoProduto {
   
    private String nome;
    private double preco;

    public metodoProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0) {
            preco -= preco * (porcentagem / 100);
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
