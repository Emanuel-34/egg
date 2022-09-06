package ejercico11.guia6;

import java.util.Scanner;

public class Ejercico11Guia6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora virtual");
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String resp; 
        do {
            System.out.println("Elija que resultado necesita");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            System.out.println("ELIJA OPCION:");
            int opcion = leer.nextInt();
            
            resp = "N";
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa?(S/N)");
                    resp = leer.next();
                    break;
                default:
                    System.out.println("La opcion no existe.");
            }
        } while (!resp.equalsIgnoreCase("S"));
    }

}
