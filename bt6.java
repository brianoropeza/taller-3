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
public class bt6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        double resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}
    

