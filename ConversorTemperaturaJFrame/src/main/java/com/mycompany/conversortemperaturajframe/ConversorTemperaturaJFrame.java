package com.mycompany.conversortemperaturajframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorTemperaturaJFrame extends JFrame {

    JLabel titulo;
    JLabel rotuloCelsius;
    JLabel resultadoKelvin, resultadoFahrenheit;

    JTextField textoCelsius;

    JButton botao;

    public ConversorTemperaturaJFrame() {

        super("Conversor de Temperatura");
        Container tela = getContentPane();
        tela.setLayout(null);

        // Título
        titulo = new JLabel("Conversor de Temperatura");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setBounds(40, 20, 300, 30);

        // Celsius
        rotuloCelsius = new JLabel("Temperatura em °C:");
        rotuloCelsius.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotuloCelsius.setBounds(30, 100, 170, 25);

        textoCelsius = new JTextField();
        textoCelsius.setBounds(190, 100, 100, 25);

        // Botão
        botao = new JButton("Converter");
        botao.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botao.setBounds(90, 170, 140, 35);

        // Resultado Kelvin
        resultadoKelvin = new JLabel("");
        resultadoKelvin.setFont(new Font("Segoe UI", Font.BOLD, 15));
        resultadoKelvin.setBounds(30, 250, 300, 25);

        // Resultado Fahrenheit
        resultadoFahrenheit = new JLabel("");
        resultadoFahrenheit.setFont(new Font("Segoe UI", Font.BOLD, 15));
        resultadoFahrenheit.setBounds(30, 290, 320, 25);

        // Evento do botão
        botao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double celsius, kelvin, fahrenheit;

                celsius = Double.parseDouble(textoCelsius.getText());
                kelvin = celsius + 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                resultadoKelvin.setText("Kelvin: " + kelvin + " K");
                resultadoFahrenheit.setText("Fahrenheit: " + fahrenheit + " °F");
            }
        });

        tela.add(titulo);
        tela.add(rotuloCelsius);
        tela.add(textoCelsius);
        tela.add(botao);
        tela.add(resultadoKelvin);
        tela.add(resultadoFahrenheit);

        setSize(380, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {

        ConversorTemperaturaJFrame app = new ConversorTemperaturaJFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}