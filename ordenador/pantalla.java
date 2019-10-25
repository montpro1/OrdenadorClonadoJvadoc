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
public class pantalla {
    private String marca;
    private float pulgadas;
    public pantalla(){
        
    }
    /**
     * en el metodo publico pantalla declaramos dos atributos: marca y pantalla.  
     * @param marca De tipo string. Es una cadena caracteres
     * @param pulgadas De tipo float. Con valor numerico que pueden ser decimales
     */
    public pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
        
        
    }
    /**
     * 
     * @param marca 
     * es un metodo public que no devuelve nada y tiene el atributo marca de tipo string
     */
    public void setMarca(String marca){
        this.marca=marca;
    }
    /**
     * es un metodo public que no devuelve nada y tiene el atributo pulgadas de tipo float
     * @param pulgadas 
     */
    public void setPulgadas(float pulgadas){
        this.pulgadas=pulgadas;
    }
    
    /**
     * es un metodo public de tipo String 
     * @return que devuelve  una cadena de caracteres de la clase marca
     */
    public String getMarca(){
        return  marca;
        
    }
    /**
     * es un metodo public de tipo float
     * @return que devuelve un valor numerico de la clase pulgadas
     */
    public float getPulgadas(){
        return pulgadas;
    }
}
