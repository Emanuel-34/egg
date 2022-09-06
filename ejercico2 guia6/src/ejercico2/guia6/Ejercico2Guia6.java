/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico2.guia6;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercico2Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre");
        String nombre = teclado.nextLine();
        System.out.println("El nombre ingresado es "+nombre);
    }
    
}
