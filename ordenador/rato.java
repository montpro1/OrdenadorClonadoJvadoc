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
public class rato {
    private String tipo;
 
    
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
    
}
}