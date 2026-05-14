package com.mycompany.triangulojframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrianguloJFrame extends JFrame {
   
    JLabel titulo,rotuloA, rotuloB, rotuloC,resultado;
    JTextField textoA, textoB, textoC;
    JButton botao;

public TrianguloJFrame(){

        super("Verificando tipos de triangulos");
        Container tela = getContentPane();
        tela.setLayout(null);

       // Título
        titulo = new JLabel("Verificando tipos de triangulos");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titulo.setBounds(40, 20, 300, 30);

        // Valor de A
        rotuloA = new JLabel("Lado 1:");
        rotuloA.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotuloA.setBounds(40, 100, 100, 25);
        textoA = new JTextField();
        textoA.setBounds(140, 100, 120, 25);

        // Valor de B
        rotuloB = new JLabel("Lado 2:");
        rotuloB.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotuloB.setBounds(40, 140, 100, 25);
        textoB = new JTextField();
        textoB.setBounds(140, 140, 120, 25);

        // Valor de C
        rotuloC = new JLabel("Lado 3:");
        rotuloC.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotuloC.setBounds(40, 180, 100, 25);
        textoC = new JTextField();
        textoC.setBounds(140, 180, 120, 25);

        // Botão
        botao = new JButton("Verificar");
        botao.setFont(new Font("Segoe UI", Font.BOLD, 15));
        botao.setBounds(90, 230, 140, 35);

        resultado = new JLabel("");
        resultado.setFont(new Font("Segoe UI", Font.BOLD, 16));
        resultado.setBounds(60, 290, 250, 25);

        // Evento do botão
        botao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double a, b, c;

                a = Double.parseDouble(textoA.getText());
                b = Double.parseDouble(textoB.getText());
                c = Double.parseDouble(textoC.getText());
                
                if (a == b && b == c) {

                    resultado.setText("Triângulo Equilátero");

                } else if (a ==  b) {

                    resultado.setText("Triângulo Isósceles");

                } else if (a == c) {

                    resultado.setText("Triângulo Isósceles");

                } else if (b == c) {

                    resultado.setText("Triângulo Isósceles");

                } else {

                    resultado.setText("Triângulo Escaleno");
                }
            }
        });

        
        tela.add(titulo);
        tela.add(rotuloA);
        tela.add(textoA);
        tela.add(rotuloB);
        tela.add(textoB);
        tela.add(rotuloC);
        tela.add(textoC);
        tela.add(botao);
        tela.add(resultado);
       
        
        setSize(350, 420);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
}
    public static void main(String[] args) {
        
        TrianguloJFrame app = new TrianguloJFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
