

package com.mycompany.exemplohipotenusa;
import javax.swing.JOptionPane;
public class ExemploHipotenusa {
 
    public static void main(String[] args) 
    {
        double base;
        double altura;
        double resultado;

        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base:"));

        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura:"));

        resultado = hipotenusa(base, altura);

        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é: " + resultado);
    }

    static double hipotenusa(double base, double altura)
    {
        double h;

        h =((base * base) + (altura * altura));

        return h;
    }
}