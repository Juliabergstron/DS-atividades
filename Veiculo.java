
package com.mycompany.veiculo;

public class Veiculo {

    public static void main(String[] args) {
    
    MetodoCarro carro = new MetodoCarro("Gol","1.0",100.00);
    MetodoMoto moto = new MetodoMoto("Hyuday","1.0",50.00);
    
    System.out.println("Marca: " + carro.getMarca()
        + " | Modelo: " + carro.getModelo()
        + " | Velocidade: " + carro.getVelocidade());
    
     carro.setMarca("BMW");
     carro.setModelo("2.0");
     
     System.out.println("Atualizado: " + carro.getMarca()
        + " | Modelo: " + carro.getModelo()
        + " | Velocidade: " + carro.getVelocidade());
     
     carro.acelerar(30.0);

     System.out.println("Após acelerar: " + carro.getVelocidade());
        
        
     System.out.println("Marca: " + moto.getMarca()
        + " | Modelo: " + moto.getModelo()
        + " | Velocidade: " + moto.getVelocidade());
    
     moto.setMarca("Honda");
     moto.setModelo("1.2");
     
     System.out.println("Atualizado: " + moto.getMarca()
        + " | Modelo: " + moto.getModelo()
        + " | Velocidade: " + moto.getVelocidade());
     
     moto.acelerar(50.0);

     System.out.println("Após acelerar: " + moto.getVelocidade());
     
    }
}
