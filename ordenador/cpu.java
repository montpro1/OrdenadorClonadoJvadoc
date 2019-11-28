/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 *
This CPU class represents the central processing unit of our PC
 * @author vmontestovar
 */
public class cpu {
    private int velocidade;
    private int memoria;
    
    public cpu(){
    }
    public cpu(int velocid,int memor){
        velocidade=velocid;
        memoria=memor;
        
    }
    public void setVelocidade(int velocid){
        velocidade=velocid;
        
    }
    public void setMemoria(int memor){
        memoria=memor;
        
    }
    public int getVelocidade(){
        return velocidade;
        
    }
    public int getMemoria(){
        return memoria;
    }
}
