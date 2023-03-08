
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t2 {
      public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedir el número
        System.out.print("Introduce un numero entero: ");
        int num = entrada.nextInt();
        
        // Comprobar si es par o impar
        if (num % 2 == 0) {
            System.out.println(num + " es un numero par");
        } else {
            System.out.println(num + " es un numero impar");
        }
    }
    
}
