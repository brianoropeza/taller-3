
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        int anio = sc.nextInt();

        boolean esBisiesto = false;

        if(anio % 4 == 0) {
            if(anio % 100 != 0) {
                esBisiesto = true;
            } else if(anio % 400 == 0) {
                esBisiesto = true;
            }
        }

        if(esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        
    }
}
