/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 *
 * @author vmontestovar
 */
public class miniordenador {
    private rato rato;
    private pantalla pantalla;
    private cpu procesador;
    
public  miniordenador(){
    rato=new rato();
    pantalla=new pantalla();
    procesador=new cpu();
    
}    
  public miniordenador(String tipo,String marca,float pulgadas,int velocidade,int memoria){
      rato=new rato(tipo);
      pantalla=new pantalla(marca,pulgadas);
      procesador=new cpu(velocidade,memoria);
  }  
  public void setRato(rato rato){
      this.rato=rato;
  }
  public void setPantalla(pantalla pantalla){
      
  }
          public void setProcesador(cpu procesador){
             this.procesador=procesador;
              
          }
          public rato getRato(){
              return rato;
              
          }
          public pantalla getPantalla(){
              return pantalla;
          }
          public cpu getProcesador(){
              return procesador;
          }
          
          public void amosar(){

          System.out.println("ednaskdnlsasdkn"+rato.getTipo()+"a pantalla e"+pantalla.getMarca()+"ertdgsgre"+pantalla.getPulgadas()+""+procesador.getMemoria()+""+procesador.getVelocidade());
 
}
          
}

