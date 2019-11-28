
package ordenador;

/**
 *
This class miniordenador represents the union of the components of our computer
 * @author vmontestovar
 */
public class miniordenador {
    private rato rato; //represents the computer mouse (pointing device)
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

