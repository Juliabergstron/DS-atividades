
package cadastrocliente;

import javax.swing.*;
import java.awt.*;

public class CadastroCliente extends JFrame {
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7;
    JTextField Texto1,Texto2,Texto3,Texto4,Texto5,Texto6,Texto7;

public CadastroCliente(){
    
    super("Cadastro de Clientes");
    Container tela = getContentPane();
    setLayout(null);
    
    rotulo1 = new JLabel("Nome");
    rotulo2 = new JLabel("CPF");
    rotulo3 = new JLabel("RG");
    rotulo4 = new JLabel("Endereço");
    rotulo5 = new JLabel("Cidade");
    rotulo6 = new JLabel("Estado");
    rotulo7 = new JLabel("CEP");
    
    Texto1 = new JTextField(50);
    Texto2 = new JTextField(11);
    Texto3 = new JTextField(9);
    Texto4 = new JTextField(50);
    Texto5 = new JTextField(50);
    Texto6 = new JTextField(20);
    Texto7 = new JTextField(8);
    
    rotulo1.setBounds(50,20,80,20);
    rotulo2.setBounds(50,60,80,20);
    rotulo3.setBounds(50,100,80,20);
    rotulo4.setBounds(50,140,80,20);
    rotulo5.setBounds(50,180,80,20);
    rotulo6.setBounds(50,220,80,20);
    rotulo7.setBounds(50,260,80,20);

    Texto1.setBounds(110,20,200,20);
    Texto2.setBounds(110,60,200,20);
    Texto3.setBounds(110,100,200,20);
    Texto4.setBounds(110,140,200,20);
    Texto5.setBounds(110,180,200,20);
    Texto6.setBounds(110,220,200,20);
    Texto7.setBounds(110,260,200,20);
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(rotulo5);
    tela.add(rotulo6);
    tela.add(rotulo7);
    
    tela.add(Texto1);
    tela.add(Texto2);
    tela.add(Texto3);
    tela.add(Texto4);
    tela.add(Texto5);
    tela.add(Texto6);
    tela.add(Texto7);
    
    setSize(400,250);
    setVisible(true);
    setLocationRelativeTo(null);
}
public static void main(String[] args) {
    
    CadastroCliente app = new CadastroCliente();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
