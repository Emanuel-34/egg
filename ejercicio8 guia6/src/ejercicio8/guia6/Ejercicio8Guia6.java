
package ejercicio8.guia6;
import java.util.Scanner;

public class Ejercicio8Guia6 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.nextLine();
        
        if (frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
