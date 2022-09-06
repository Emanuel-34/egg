/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.guia6;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio13Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int num = leer.nextInt();
        if (num >= 0 && num<=10 ){
            //linea superior
            for(int i = 0; i < num; i++ ){
                System.out.print("*");
            }
            System.out.println();
            //centro de la forma
            for(int i = 0; i < num-2; i++){
                System.out.print("*");
                for (int j = 0; j < num-2; j++){
                    System.out.print(" ");
            }
                System.out.println("*");
            }
            //linea inferior
            for(int i = 0; i < num; i++ ){
                System.out.print("*");
            }
            System.out.println("");
        }else {
            System.out.println("Error al ingresar un dato");
        }
    }
    
}
/*de otra forma:
Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la longitud que desea del cuadrado: ");
        int longitud = leer.nextInt();
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                if (i==0||j==0||i==longitud-1||j==longitud-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }*/
