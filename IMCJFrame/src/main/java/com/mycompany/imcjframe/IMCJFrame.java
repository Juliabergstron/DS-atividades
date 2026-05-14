package com.mycompany.imcjframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IMCJFrame extends JFrame{

public IMCJFrame(){
    
    JLabel titulo,Peso, Altura,resultado;
    JTextField texto1, texto2;
    JButton botao;

        super("Cálculo IMC");
        Container tela = getContentPane();
        tela.setLayout(null);

        // Título
        titulo = new JLabel("Cálculo de IMC");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titulo.setBounds(80, 20, 250, 30);

        // Peso
        Peso = new JLabel("Peso:");
        Peso.setFont(new Font("Segoe UI", Font.BOLD, 15));
        Peso.setBounds(40, 100, 100, 25);
        texto1 = new JTextField();
        texto1.setBounds(140, 100, 120, 25);

        // Altura
        Altura = new JLabel("Altura:");
        Altura.setFont(new Font("Segoe UI", Font.BOLD, 15));
        Altura.setBounds(40, 150, 100, 25);
        texto2 = new JTextField();
        texto2.setBounds(140, 150, 120, 25);

        // Botão
        botao = new JButton("Calcular");
        botao.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botao.setBounds(90, 220, 140, 35);

        // Resultado
        resultado = new JLabel("");
        resultado.setFont(new Font("Segoe UI", Font.BOLD, 15));
        resultado.setBounds(30, 290, 320, 30);

        // Evento do botão
        botao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double peso, altura, imc;

                peso = Double.parseDouble(texto1.getText());
                altura = Double.parseDouble(texto2.getText());

                imc = peso / (altura * altura);

                if (imc < 18.5) {

                    resultado.setText("Abaixo do peso. IMC = " + imc);

                } else if (imc >= 18.5 && imc <= 24.99) {

                    resultado.setText("Peso ideal. IMC = " + imc);

                } else {

                    resultado.setText("Acima do peso ideal. IMC = " + imc);
                }
            }
        });

        tela.add(titulo);
        tela.add(Peso);
        tela.add(texto1);
        tela.add(Altura);
        tela.add(texto2);
        tela.add(botao);
        tela.add(resultado);

        setSize(380, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        IMCJFrame app = new IMCJFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
