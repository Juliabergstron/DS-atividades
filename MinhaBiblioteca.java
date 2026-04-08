
package com.mycompany.biblioteca;
import java.util.ArrayList;
public class MinhaBiblioteca {
  
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro); 
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}