
package ejercicio10;
  //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

import java.util.Scanner;
public class Ejercicio10 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int valorL = leer.nextInt();
        int num, suma = 0;
            System.out.println("Ingrese numeros hasta que la suma de los mismos supere el valor limite");
        do{
          num = leer.nextInt();
          suma += num;
              
        }while (suma <= valorL);
        System.out.println("Superaste el valor limite");
    }
    
}
