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
public class t15 {
     public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Introduce un número entero entre 1 y 12: ");
      int mes = sc.nextInt();

      if (mes >= 1 && mes <= 12) {
         switch (mes) {
            case 2:
               System.out.println("El mes de febrero tiene 28 o 29 días, dependiendo del año.");
               break;
            case 4:
            case 6:
            case 9:
            case 11:
               System.out.println("El mes de " + mes + " tiene 30 días.");
               break;
            default:
               System.out.println("El mes de " + mes + " tiene 31 días.");
               break;
         }
      } else {
         System.out.println("Error: el número debe estar entre 1 y 12.");
      }
   }
    
}
