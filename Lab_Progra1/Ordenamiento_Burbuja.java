/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

/**
 *
 * @author RetselHerdez
 */
public class Ordenamiento_Burbuja {
    public static void main(String[] args) {
        System.out.println("****** Ordenamiento Burbuja ******");
        int ArrayNumbers[]=new int [20];

        for (int i=0;i<ArrayNumbers.length;i++){
            ArrayNumbers[i]=(int)(Math.random()*ArrayNumbers.length);
        }
        for (int a:ArrayNumbers){
            System.out.println(a);
        }
        for (int i=0;i<(ArrayNumbers.length);i++){
            
            for (int x=0;x<ArrayNumbers.length-1;x++){

                if (ArrayNumbers[x] >ArrayNumbers[x+1]){
                    int numero_Actual =ArrayNumbers[x];
                    ArrayNumbers[x]=ArrayNumbers[x+1];
                    ArrayNumbers[x+1]=numero_Actual;

                }
            }
        }
        System.out.println("");
        for (int a:ArrayNumbers){
            System.out.println(a);
        }
    }
}
