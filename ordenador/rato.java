
package ordenador;

/**
 *
I create a class that represents the computer mouse (pointing device)
 * @author vmontestovar
 */
public class rato {
    /**
     * 

     */
    private String tipo;
 /**
  *  attribute TIPO represents the physical characteristics of the mouse
  */
  
    public rato(){
}
public rato(String tipo){
    this.tipo=tipo;
    
}
public void setTipo(String tipo){
    this.tipo=tipo;
    
}
public String getTipo(){
    return tipo;
   //commit  
}
}