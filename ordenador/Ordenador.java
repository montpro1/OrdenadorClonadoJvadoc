
package ordenador;

import java.util.Scanner;

/**
 *main class
 * @author vmontestovar
 */
public class Ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
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
       
    
     miniordenador ord=new miniordenador(rato,pantalla,pantalla1,cpu,cpu1);
       ord.amosar();
     //commit para el examen 3
     }  
       
      
       
        
        // TODO code application logic here
    }
    

