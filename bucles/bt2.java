/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class bt2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de números a introducir: ");
        int cantidad = sc.nextInt();
        
        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }
        
        System.out.println("Cantidad de números mayores que 0: " + mayoresCero);
        System.out.println("Cantidad de números menores que 0: " + menoresCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesCero);
    }
}
