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
public class T13 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el resultado del lanzamiento del dado: ");
        int resultado = sc.nextInt();

        String caraOpuesta;

        switch (resultado) {
            case 1 -> caraOpuesta = "seis";
            case 2 -> caraOpuesta = "cinco";
            case 3 -> caraOpuesta = "cuatro";
            case 4 -> caraOpuesta = "tres";
            case 5 -> caraOpuesta = "dos";
            case 6 -> caraOpuesta = "uno";
            default -> {
                    System.out.println("ERROR: número incorrecto");
                    return;
                }
        }

        System.out.println("La cara opuesta al resultado " + resultado + " es " + caraOpuesta);
    }
}

    
