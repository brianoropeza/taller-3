
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del primer lado del triángulo: ");
        double lado1 = sc.nextDouble();
        System.out.println("Introduce el tamaño del segundo lado del triángulo: ");
        double lado2 = sc.nextDouble();
        System.out.println("Introduce el tamaño del tercer lado del triángulo: ");
        double lado3 = sc.nextDouble();

        if(lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else if(Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) || 
                  Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2) || 
                  Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2)) {
            System.out.println("El triángulo es rectángulo.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
        
    }
    
}
