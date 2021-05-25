import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class RandomGame {
    public static void main(String[] args) {
        
        int aleatorio = (int)(Math.random()*100); // Genera y almacena un numero entre 0 y 100

        Scanner scam = new Scanner(System.in); // Abreo la consola para ingresar un valor por teclado

        int num = 0; //  Variable donde se va almacenar lo que el usuario ingrese por teclado

        int intentos = 0; // Variable donde se almacena los intendos ralizado por el usuario

        while (num!= aleatorio){ // Miendtras el num sea distino a aleatorio se ejecutara el while

            System.out.println("Porfavor ingrese el número:"); // Imprime un mensaje para el usuario

            num = scam.nextInt(); // el valor que el usuario ingrese  se almacena en la variable num

            if (aleatorio < num ) {

                System.out.println("Más bajo ");
            }

            else if (aleatorio > num ) {
                System.out.println("Más alto ");
            }

            ++intentos;
        }
        scam.close();

        System.out.println("Correcto");
        System.out.println("Intentos realizados " + intentos); 

    }
}
