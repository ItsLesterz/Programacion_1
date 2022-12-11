/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Progra1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author RetselHerdez
 */
class CaracterRep {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Frease: ");
        String str = leer.nextLine();
	// Convierta una cadena en una matriz de caracteres, que viene con jdk, muy fácil de usar
	char[] chars = str.toCharArray();
	 // Definir un mapa, la clave es char, el valor es Integer
	Map<Character, Integer> map = new HashMap<Character,Integer>();
	 // Pon la matriz de caracteres en el mapa de una vez
	for(int i = 0;i<chars.length;i++) {
		 // Si no hay una clave actual, cree un nuevo nodo para poner los datos
		if(!map.containsKey(chars[i])) {
			map.put(chars[i], 1);
		} else {
			 map.put (chars [i], map.get (chars [i]) + 1); // Si la clave actual existe, el valor actual es +1
			
		}
	}
	 // Inicializa el número de veces que aparece el valor de cada clave
	int n = 1;
	 // Inicializar un carácter sin sentido para su reemplazo posterior
	char a = 'o';
	for(int i = 0;i<map.size();i++) {
		int num = map.get(chars[i]);
		if(num>n) {
			 n = num; // El valor máximo que aparece en value se asigna an,
			 a = chars [i]; // Dar la clave con el valor más grande a un
		}
	}
	  System.out.println ("Caracteres que han aparecido con mayor frecuencia:" + a + "Apariciones:" + n);
}
}