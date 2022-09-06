package ejercicio12.guia6;

import java.util.Scanner;

public class Ejercicio12Guia6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correcto, incorrecto;

        correcto = 0;
        incorrecto = 0;
        String cadena;

        System.out.println("Ingrese una cadena de caracteres de 5 letras");
        System.out.println("El pimer caracter tiene que inicar con X y tiene que finalizar con O ");
        do{
        System.out.println("Ingrese una cadena de caracteres correcta");
        cadena = leer.nextLine();

        
            int longitud = cadena.length();

        if (cadena.substring(0, 1).equalsIgnoreCase("x") && cadena.substring(4,5).equalsIgnoreCase("o") && longitud == 5);{
            //otra forma: (cadena.substring(0, 1).equalsIgnoreCase("x") && cadena.endsWith("o") && longitud == 5)
            correcto++;
        }else{
         incorrecto++;
            }
        }while (!cadena.equals("&&&&&&"))
       
       
        System.out.println("La cantidad de correctas es " + correcto);
        System.out.println("La caantidad de incorrectas" + incorrecto);

    }

}

/*String frase;

        int correctas = 0;
        int incorrectas = -1;
        do {
            System.out.println("Ingrese la frase");
            Scanner entrada = new Scanner(System.in);
            frase = entrada.nextLine();

            if ((frase.length() == 5) && (frase.substring(0, 1).equalsIgnoreCase("x")) && (frase.substring(4, 5).equalsIgnoreCase("o"))) {
                correctas++;
            } else {
                incorrectas++;
            }

        } while (!(frase.equals("&&&&&")));
        System.out.println("las correctas son: "+ correctas);
        System.out.println("y las incorrectas son: "+ incorrectas);
    }*/
