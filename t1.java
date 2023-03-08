
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = entrada.nextInt();
        
        // Pedims el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = entrada.nextInt();
        
        // Comparar los números
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales");
        }

    }
    
}
