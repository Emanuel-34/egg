
package ejercicio7.guia6;

import java.util.Scanner;
public class Ejercicio7Guia6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para ver si es correcta");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        } else 
            System.out.println("Incorrecto");{
    }
                
         
    }
    
}
