
package com.mycompany.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
       MinhaBiblioteca biblioteca = new MinhaBiblioteca();

        Livro l1 = new Livro("A princessa e o sapo", "Autor A");
        Livro l2 = new Livro("A Bela e a Fera", "Autor B");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        Livro encontrado = biblioteca.buscarPorTitulo("A princessa e o sapo");

        if (encontrado != null) {
            System.out.println("Livro encontrado: " + encontrado.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }
    }
}