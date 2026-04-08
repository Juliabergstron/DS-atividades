
package com.mycompany.contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {
   
    MetodoConta conta= new MetodoConta(1000);       
    
     conta.depositar(500);
     conta.sacar(300);

     System.out.println("Saldo final: " + conta.getSaldo());
    }
}