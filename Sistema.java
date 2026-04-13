
package com.mycompany.sistema;

public class Sistema {

    public static void main(String[] args) {
    
        Calculadora calc = new Calculadora();
        Repositorio repo = new Repositorio();
        Impressora imp = new Impressora();

        calc.calcularTotal();
        repo.salvarDados();
        imp.imprimirRelatorio();
    }
}