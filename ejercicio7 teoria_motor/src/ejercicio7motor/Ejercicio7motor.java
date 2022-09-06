
package ejercicio7motor;

import java.util.Scanner;

public class Ejercicio7motor {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int TipoMotor;
        Scanner leer  = new Scanner(System.in);
        System.out.println("Ingrese el numero del 1 al 4, para determinar el tipo de motor");
        System.out.println("1: Bomba de agua");
        System.out.println("2: Bomba de gasolina");
        System.out.println("3: Bomba de hormigon");
        System.out.println("4: Bomba de pasta alimenticia");
           
        TipoMotor = leer.nextInt();
        switch (TipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para un tipo de bomba");
                  
                
        }
        
    }
    
}
