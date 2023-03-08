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
public class t14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del día de la semana (1 al 7): ");
        int dia = sc.nextInt();
        
        
        String nombreDia;
        
        nombreDia = switch (dia) {
             case 1 -> "Lunes";
             case 2 -> "Martes";
             case 3 -> "Miércoles";
             case 4 -> "Jueves";
             case 5 -> "Viernes";
             case 6 -> "Sábado";
             case 7 -> "Domingo";
             default -> "ERROR: número incorrecto";
         };
        
        System.out.println(nombreDia);
    }
    
}
