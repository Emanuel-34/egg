
package ejercico6.teoria;

import java.util.Scanner;

public class Ejercico6TEORIA {

    
    public static void main(String[] args) {
       int num1, num2;
Scanner leer = new Scanner (System.in);
System.out.println("Ingrese 2 numeros para comparar");
num1 = leer.nextInt();
num2 = leer.nextInt();

   if (num1 > 25 & num2 > 25){
   System.out.println("ambos nuemors son mayores a 25");

    }else if (num1 > 25){
        System.out.println("El numero 1 es mayor a 25)");
        }
else if (num2 > 25){
    System.out.println("Eel numero 2 es mayor a 25");
    }
else {
        System.out.println("Nigun numero es mayor a 25");
        }
    }
}
    
    

