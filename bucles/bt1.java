/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(100) + 1;
        int intentos = 10;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes que adivinar un número del 1 al 100");
        System.out.println("¡Tienes " + intentos + " intentos para lograrlo!");

        while (intentos > 0) {
            System.out.print("Introduce un número: ");
            int numUsuario = sc.nextInt();

            if (numUsuario == numAleatorio) {
                System.out.println("¡Felicidades, has acertado el número en " + (10 - intentos + 1) + " intentos!");
                return;
            } else if (numUsuario < numAleatorio) {
                System.out.println("El número a adivinar es mayor que " + numUsuario);
            } else {
                System.out.println("El número a adivinar es menor que " + numUsuario);
            }

            intentos--;
            System.out.println("Te quedan " + intentos + " intentos.");
        }

        System.out.println("Lo siento, has superado el límite de intentos. El número era " + numAleatorio + ".");
    }
    
}
