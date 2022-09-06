

package ejercicio4.guia6;

import java.util.Scanner;

public class Ejercicio4Guia6 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados que quiere convertir a Fahrenheit");
        Double gradosC = leer.nextDouble();
        System.out.println("los "+ gradosC +" convertido en Fahrenheit es "+ (32 +(9*gradosC / 5)));
        
    }
    
}
