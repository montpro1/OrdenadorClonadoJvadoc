/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ordenador ord=new ordenador();
       Scanner sc=new Scanner(System.in);
       System.out.println("tipo de raton");
       String rato=sc.next();
       System.out.print("marca de la pantalla");
       String pantalla=sc.next();
       System.out.println("pulgadas de la pantalla");
       float pantalla1=sc.nextFloat();
       System.out.println("velocidade del cpu");
       int cpu=sc.nextInt();
       System.out.println("memoria del cpu");
       int cpu1=sc.nextInt();
       
    
    
       ord.amosar();
       System.out.println("el tipo de rato e"+ord.getRato()+"a pantalla e"+ord.getPantalla()+"o cpu e"+ord.getProcesador());
     }  
       
      
       
        
        // TODO code application logic here
    }
    

