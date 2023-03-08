/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de10;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class t16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, costoTotal;
        int zona;

        // pedir el peso del paquete
        System.out.print("Ingrese el peso del paquete en kg (máximo 5kg): ");
        peso = scanner.nextDouble();

        if (peso > 5) {
            System.out.println("Lo sentimos, no podemos transportar paquetes con peso mayor a 5kg.");
        } else {
            // pedir la zona de destino
            System.out.print("Ingrese la zona de destino (1: América del Norte, 2: América Central, 3: América del Sur, 4: Europa, 5: Asia): ");
            zona = scanner.nextInt();

            // calcular el costo total del transporte
            switch (zona) {
                case 1 -> costoTotal = peso * 24.0;
                case 2 -> costoTotal = peso * 20.0;
                case 3 -> costoTotal = peso * 21.0;
                case 4 -> costoTotal = peso * 10.0;
                case 5 -> costoTotal = peso * 18.0;
                default -> {
                        System.out.println("La zona ingresada no es válida.");
                        return;
                }
            }

            // mostrar el costo total del transporte
            System.out.printf("El costo total del transporte es: %.2f euros", costoTotal);
        }
    }
    
}
