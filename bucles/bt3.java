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
public class bt3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.print("Introduce un caracter: ");
            c = sc.nextLine().charAt(0);
            if (c == ' ') {
                break;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        } while (c != ' ');
    }
    
}
