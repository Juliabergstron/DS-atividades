/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pesoplanetajframe;

import javax.swing.JFrame;
/**
 *
 * @author bergs
 */
public class PesoPlanetaJFrame {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Peso nos Planetas");

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.add(new NewJFrame());

        tela.pack();

        tela.setLocationRelativeTo(null);

        tela.setVisible(true);
    }
}
