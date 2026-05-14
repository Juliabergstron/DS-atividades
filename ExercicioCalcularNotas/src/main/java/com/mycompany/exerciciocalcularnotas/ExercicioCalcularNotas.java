package com.mycompany.exerciciocalcularnotas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExercicioCalcularNotas extends JFrame {

    JLabel titulo, rotulo, rotulo1, rotulo2, rotulo3, rotulo4, exibir;
    JTextField texto1, texto2, texto3, texto4;
    JButton botao;

    public ExercicioCalcularNotas() {

        super("ExercicioCalcularNotas");

        Container tela = getContentPane();
        tela.setLayout(null);

        titulo = new JLabel("Calcular Média");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setBounds(110, 10, 200, 30);

        rotulo = new JLabel("Digite as 4 notas:");
        rotulo.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotulo.setBounds(50, 50, 200, 20);

        // Nota 1
        rotulo1 = new JLabel("Nota 1:");
        rotulo1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotulo1.setBounds(50, 90, 100, 20);

        texto1 = new JTextField();
        texto1.setBounds(130, 90, 100, 25);

        // Nota 2
        rotulo2 = new JLabel("Nota 2:");
        rotulo2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotulo2.setBounds(50, 130, 100, 20);

        texto2 = new JTextField();
        texto2.setBounds(130, 130, 100, 25);

        // Nota 3
        rotulo3 = new JLabel("Nota 3:");
        rotulo3.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotulo3.setBounds(50, 170, 100, 20);

        texto3 = new JTextField();
        texto3.setBounds(130, 170, 100, 25);

        // Nota 4
        rotulo4 = new JLabel("Nota 4:");
        rotulo4.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotulo4.setBounds(50, 210, 100, 20);

        texto4 = new JTextField();
        texto4.setBounds(130, 210, 100, 25);

        // Botão
        botao = new JButton("Calcular");
        botao.setFont(new Font("Segoe UI", Font.BOLD, 15));
        botao.setBounds(250, 130, 110, 40);

        // Resultado
        exibir = new JLabel("");
        exibir.setFont(new Font("Segoe UI", Font.BOLD, 16));
        exibir.setBounds(70, 260, 250, 30);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double numero1, numero2, numero3, numero4, resultado;

                numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());
                numero3 = Double.parseDouble(texto3.getText());
                numero4 = Double.parseDouble(texto4.getText());

                resultado = (numero1 + numero2 + numero3 + numero4) / 4;

                exibir.setText("A média é: " + resultado);
            }
        });

        // Adicionando componentes
        tela.add(titulo);
        tela.add(rotulo);

        tela.add(rotulo1);
        tela.add(texto1);

        tela.add(rotulo2);
        tela.add(texto2);

        tela.add(rotulo3);
        tela.add(texto3);

        tela.add(rotulo4);
        tela.add(texto4);

        tela.add(botao);
        tela.add(exibir);

        setSize(420, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {

        ExercicioCalcularNotas app = new ExercicioCalcularNotas();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}