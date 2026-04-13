
package com.mycompany.veiculo;


public class MetodoMoto {
  
    private String Marca;
    private String Modelo;
    private Double Velocidade;
    
    public MetodoMoto ( String marca,String modelo, Double velocidade){
            this.Marca = marca;
            this.Modelo = modelo;
            this.Velocidade = velocidade;
    }
    
    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }
    
    public Double getVelocidade() {
        return Velocidade;
    }
       
    public void setMarca(String marca) {
        this.Marca = marca;
    }

     public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
     
      public void setVelocidade(Double velocidade) {
       this.Velocidade = velocidade;
    }
    public void acelerar( Double valor){
     if (valor > 0) {
        this.Velocidade += valor;
        System.out.println("Acelerando... Velocidade atual: " + this.Velocidade);
    } else {
        System.out.println("Valor inválido!");
    
      }}      
}
