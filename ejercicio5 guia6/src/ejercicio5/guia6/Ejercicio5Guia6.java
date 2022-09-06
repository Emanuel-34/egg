
package ejercicio5.guia6;

import java.util.Scanner;


public class Ejercicio5Guia6 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("El doble de "+ num + " es: "+ num*2);
        System.out.println("El triple de "+ num + " es: "+ num*3);
        System.out.println("La raiz cuadrada de "+ num + " es: "+ Math.sqrt(num));
    }
    
}
