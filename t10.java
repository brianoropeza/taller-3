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
public class t10 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de uva (A o B): ");
        String tipo = sc.next();

        System.out.println("Ingrese el tamaño de uva (1 o 2): ");
        int tamano = sc.nextInt();

        System.out.println("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = sc.nextDouble();

        double precioFinal = 0;

        if(tipo.equals("A")) {
            if(tamano == 1) {
                precioFinal = precioInicial + 0.20;
            } else if(tamano == 2) {
                precioFinal = precioInicial + 0.30;
            }
        } else if(tipo.equals("B")) {
            if(tamano == 1) {
                precioFinal = precioInicial - 0.30;
            } else if(tamano == 2) {
                precioFinal = precioInicial - 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal);

    }

}
    

