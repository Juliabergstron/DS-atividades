
package com.mycompany.exemplomedia;
import javax.swing.JOptionPane;
public class ExemploMedia {

    public static void main(String[] args) {

        String nome;
        double n1, n2, media;

        nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

        n1 = lerNota("Digite a primeira nota:");
        n2 = lerNota("Digite a segunda nota:");

        media = calcularMedia(n1, n2);

        if (media >= 7) {
            JOptionPane.showMessageDialog(null,
                    "Aluno: " + nome +
                    "\nMédia: " + media +
                    "\nSituação: APROVADO");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Aluno: " + nome +
                    "\nMédia: " + media +
                    "\nSituação: REPROVADO");
        }
    }

    static double lerNota(String mensagem) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
    }

    static double calcularMedia(double a, double b) {
        return (a + b) / 2;
    }
}