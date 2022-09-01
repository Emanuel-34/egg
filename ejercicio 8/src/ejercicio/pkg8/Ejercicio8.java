/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("La nota tiene que estar entre 0 y 10");
            nota = leer.nextInt();
        }
            System.out.print("La nota" + nota + "esta entre 0 y 10");
                
                
    }
    
}
