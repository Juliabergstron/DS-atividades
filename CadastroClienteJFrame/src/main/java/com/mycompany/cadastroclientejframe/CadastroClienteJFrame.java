

package com.mycompany.cadastroclientejframe;

import javax.swing.JFrame;

public class CadastroClienteJFrame {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Cadastro de Cliente");

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setContentPane(new TelaCadastro());

        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }}