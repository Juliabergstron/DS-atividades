
package com.mycompany.calculadorajframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculos extends JFrame {
    
    JLabel titulo,rotulo,rotulo1, rotulo2, exibir,exibir2;
    JTextField texto1, texto2;
    JButton somar,multiplicar,dividir,raiz; 
    
public  Calculos (){

        super("Exemplo de soma");
        Container tela = getContentPane();
        setLayout(null);

        
        titulo = new JLabel("Calculadora");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setBounds(110,10,120,20);
        
        rotulo = new JLabel("Adicione os números: ");
        rotulo.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotulo.setBounds(90,50,200,20);
        
        rotulo1 = new JLabel("1º: "); 
        rotulo1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        rotulo1.setBounds(50,100,100,20);
        texto1 = new JTextField(10);
        texto1.setBounds(80,100,70,25);
        
        rotulo2 = new JLabel("2º: ");
        rotulo2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        rotulo2.setBounds(180,100,100,20);
        texto2 = new JTextField(5);
        texto2.setBounds(210,100,70,25);
        
        exibir = new JLabel("");
        exibir.setFont(new Font("Segoe UI", Font.BOLD, 18));
        exibir.setBounds(90,400,200,20); 
        
        exibir2 = new JLabel("");
        exibir2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        exibir2.setBounds(90,420,200,20);  
        
        somar = new JButton("+");
        somar.setFont(new Font("Segoe UI", Font.BOLD, 40));
        somar.setBounds(50,150,100,100);
        
        multiplicar = new JButton("x");
        multiplicar.setFont(new Font("Segoe UI", Font.BOLD, 40));
        multiplicar.setBounds(180,150,100,100);
        
        dividir = new JButton("%");
        dividir.setFont(new Font("Segoe UI", Font.BOLD, 40));
        dividir.setBounds(50,280,100,100);
        
        raiz = new JButton("x²");
        raiz.setFont(new Font("Segoe UI", Font.BOLD, 40));
        raiz.setBounds(180,280,100,100);

        titulo.setForeground(Color.WHITE);
        rotulo.setForeground(Color.LIGHT_GRAY);
        rotulo1.setForeground(Color.WHITE);
        rotulo2.setForeground(Color.WHITE);
        exibir.setForeground(Color.GREEN);
        exibir2.setForeground(Color.GREEN);
        tela.setBackground(new Color(30, 30, 30));
        
        Color corBotao = new Color(140, 82, 255);
        Color corBotao2 = new Color (255, 140, 0);

        somar.setBackground(corBotao);
        multiplicar.setBackground(corBotao2);
        dividir.setBackground(corBotao2);
        raiz.setBackground(corBotao);

        somar.setForeground(Color.WHITE);
        multiplicar.setForeground(Color.WHITE);
        dividir.setForeground(Color.WHITE);
        raiz.setForeground(Color.WHITE);
        
        somar.setBorderPainted(false);
        multiplicar.setBorderPainted(false);
        dividir.setBorderPainted(false);
        raiz.setBorderPainted(false);
         /* Ações dos botões*/
         
        somar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, soma;
                    soma = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                    exibir.setText("O resultado é: " + soma);
                }
            }
        );

        multiplicar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, multiplicacao;
                    multiplicacao = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    multiplicacao = numero1 * numero2;
                    exibir.setVisible(true);
                    exibir.setText("O resultado é: " + multiplicacao);
                }
            }
        );
        
        dividir.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, divisao;
                    divisao = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    divisao = numero1 / numero2;
                    exibir.setVisible(true);
                    exibir.setText("O resultado é: " + divisao);
                }
            }
        );
        
        raiz.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
             
                double numero1, numero2, raiz1, raiz2;

                numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());

                raiz1 = Math.sqrt(numero1);
                raiz2 = Math.sqrt(numero2);

                exibir.setVisible(true);
                exibir2.setVisible(true);
                exibir.setText("A primeira raiz é: " + raiz1 );
                exibir2.setText("A segunda raiz é: " + raiz2 );
                }
            }
        );
        
        
        
        exibir.setVisible(false);

        tela.add(titulo);
        tela.add(rotulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(exibir2);
        tela.add(somar);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(raiz);

        setSize(350, 510);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

}
