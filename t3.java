
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t3 {
      public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedir el primer número
        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        
        // Pedir el segundo número
        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        
        // Comprobar que el segundo número no sea cero
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero");
        } else {
            // Calcular la división y mostrar el resultado
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
      }
}
