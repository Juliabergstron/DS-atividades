/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogorandomjframe;

import javax.swing.JFrame;

/**
 *
 * @author bergs
 */
public class JogoRandomJFrame {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Jokempo");

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.add(new JogoPainel());

        tela.pack();

        tela.setLocationRelativeTo(null);

        tela.setVisible(true);

    }
}
