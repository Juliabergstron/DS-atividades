package com.mycompany.principal;

import javax.swing.JOptionPane;

public class EntradaSaidaDados {
    public String entradaDados (String mensagemEntrada) {
        return JOptionPane.showInputDialog (mensagemEntrada);
    }
    public String entradaDados2 (String mensagemEntrada2) {
        return JOptionPane.showInputDialog (mensagemEntrada2);
    }
    public void saidaDados (String mensagemSaida) {
        JOptionPane.showMessageDialog (null, mensagemSaida);
    }
}
