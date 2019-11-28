
package ordenador;

/**
 *
This class pantalla represents the main output device of our computer
 * @author vmontestovar
 */
public class pantalla {
  
    private String marca;
    private float pulgadas;
    public pantalla(){
        
    }
    /**
     *   
     * @param marca this attribute is the screen brand

     * @param pulgadas 
is the length of the screen
     */
    public pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
        
        
    }
   
    public void setMarca(String marca){
        this.marca=marca;
    }
   
    public void setPulgadas(float pulgadas){
        this.pulgadas=pulgadas;
    }
    
  
    public String getMarca(){
        return  marca;
        
    }
   
    public float getPulgadas(){
        return pulgadas;
    }
}
