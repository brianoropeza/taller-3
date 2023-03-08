
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedir la edad, la nota y el sexo
        System.out.print("Introduce la edad: ");
        int edad = entrada.nextInt();
        System.out.print("Introduce la nota: ");
        double nota = entrada.nextDouble();
        System.out.print("Introduce el sexo (M/F): ");
        char sexo = entrada.next().charAt(0);
        
        // Calcular la aceptación de la solicitud
        String aceptacion = "NO ACEPTADA";
        
        if (nota >= 5 && edad >= 18 && sexo == 'M') {
            aceptacion = "POSIBLE";
        } else if (nota >= 5 && edad >= 18 && sexo == 'F') {
            aceptacion = "ACEPTADA";
        }
        
        // Mostrar la aceptación de la solicitud
        System.out.println("La solicitud ha sido " + aceptacion);
    }
}
