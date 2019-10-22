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
