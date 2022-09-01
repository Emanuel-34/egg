/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7motor;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio7motor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int TipoMotor;
        Scanner leer  = new Scanner(System.in);
        System.out.println("Ingrese el nuemro del motor a determinarel tipo");
        TipoMotor = leer.nextInt();
        switch (TipoMotor){
            case 1:
                System.out.println("La bomba es de gasolina");
            case 2:
                System.out.println("La bomba es de gasolina");
            case 3:
                System.out.println("La bomba es de gasolina");
            case 4:
                System.out.println("La bomba es de gasolina");
                
        }
        
    }
    
}
