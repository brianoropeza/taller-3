
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t5 {
       public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedir el número y el exponente
        System.out.print("Introduce el número: ");
        double num = entrada.nextDouble();
        System.out.print("Introduce el exponente: ");
        int exp = entrada.nextInt();
        
        // Calcular la potencia y mostrar el resultado
        double resultado = 0;
        
        if (exp > 0) {
            resultado = Math.pow(num, exp);
            System.out.println(num + " elevado a " + exp + " es igual a " + resultado);
        } else if (exp == 0) {
            resultado = 1;
            System.out.println(num + " elevado a " + exp + " es igual a " + resultado);
        } else {
            resultado = 1 / Math.pow(num, -exp);
            System.out.println(num + " elevado a " + exp + " es igual a " + resultado);
        }
       }
       
}
