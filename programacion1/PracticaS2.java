/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author RetselHerdez
 */
public class PracticaS2 {
    
    public static void main(String[] args) 
    {
       double numero=15.6923;
       
        System.out.println("Originalmente el numero es: "+numero);
        
        System.out.println("Con round: "+ (Math.round(numero*100)/100));
        
        System.out.println("Con floor: "+ Math.floor(numero));
        
        System.out.println("Con ceil: "+ Math.ceil(numero));
    }
    
}
