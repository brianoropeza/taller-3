
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce una letra: ");
        String cadena = entrada.nextLine();
        
        // Comprobar si es una letra mayúscula
        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println(cadena + " es una letra mayúscula");
        } else {
            System.out.println(cadena + " no es una letra mayúscula");
        }
    }
    
    
}
