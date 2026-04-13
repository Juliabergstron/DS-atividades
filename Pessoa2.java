
package com.mycompany.pessoa2;

public class Pessoa2 {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("João", 20, "2024001");

        System.out.println("Aluno: " + aluno1.getNome() 
        + " | Idade: " + aluno1.getIdade() 
        + " | Matrícula: " + aluno1.getMatricula());

       
        aluno1.setNome("João Silva");
        aluno1.setIdade(21);
        aluno1.setMatricula("2024002");

    System.out.println("Atualizado: " + aluno1.getNome() 
    + " | Idade: " + aluno1.getIdade() 
    + " | Matrícula: " + aluno1.getMatricula());
    }
}
    