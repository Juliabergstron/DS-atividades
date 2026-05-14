package com.mycompany.teoremadepitagoras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TeoremaDePitagoras extends JFrame {

    JLabel titulo,rotuloA, rotuloB,exibir;
    JTextField textoA, textoB;
    JButton botao;
    
public TeoremaDePitagoras(){

        super("Teorema de Pitágoras");
        Container tela = getContentPane();
        tela.setLayout(null);

        // Título
        titulo = new JLabel("Teorema de Pitágoras");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titulo.setBounds(70, 20, 300, 30);
        
        // Valor de A
        rotuloA = new JLabel("Cateto A:");
        rotuloA.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotuloA.setBounds(40, 100, 100, 25);
        textoA = new JTextField();
        textoA.setBounds(140, 100, 120, 25);

        // Valor de B
        rotuloB = new JLabel("Cateto B:");
        rotuloB.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rotuloB.setBounds(40, 140, 100, 25);
        textoB = new JTextField();
        textoB.setBounds(140, 140, 120, 25);


        // Botão
        botao = new JButton("Calcular");
        botao.setFont(new Font("Segoe UI", Font.BOLD, 15));
        botao.setBounds(90, 230, 140, 35);

        // Resultados
        exibir = new JLabel("");
        exibir.setFont(new Font("Segoe UI", Font.BOLD, 16));
        exibir.setBounds(60, 290, 250, 25);


        // Evento do botão
        botao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                 double a, b, hipotenusa;

                a = Double.parseDouble(textoA.getText());
                b = Double.parseDouble(textoB.getText());

                hipotenusa = Math.sqrt((a * a) + (b * b));

                exibir.setText("Hipotenusa = " + hipotenusa);
            }});
                
        tela.add(titulo);
        tela.add(rotuloA);
        tela.add(textoA);
        tela.add(rotuloB);
        tela.add(textoB);
        tela.add(exibir);
        tela.add(botao);


               
        setSize(350, 420);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
}    
    
    public static void main(String[] args) {
        TeoremaDePitagoras app = new TeoremaDePitagoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
