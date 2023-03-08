
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class t7 {
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedir los puntos centrales y los radios de las circunferencias
        System.out.println("Introduce los puntos centrales y los radios de las circunferencias:");
        System.out.print("x1: ");
        double x1 = entrada.nextDouble();
        System.out.print("y1: ");
        double y1 = entrada.nextDouble();
        System.out.print("r1: ");
        double r1 = entrada.nextDouble();
        System.out.print("x2: ");
        double x2 = entrada.nextDouble();
        System.out.print("y2: ");
        double y2 = entrada.nextDouble();
        System.out.print("r2: ");
        double r2 = entrada.nextDouble();
        
        // Calcular la distancia entre los puntos centrales de las circunferencias
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // Clasificar las circunferencias
        if (distancia > r1 + r2) {
            System.out.println("Las circunferencias son exteriores");
        } else if (distancia == r1 + r2) {
            System.out.println("Las circunferencias son tangentes exteriores");
        } else if (distancia < r1 + r2 && distancia > Math.abs(r2 - r1)) {
            System.out.println("Las circunferencias son secantes");
        } else if (distancia == Math.abs(r2 - r1)) {
            System.out.println("Las circunferencias son tangentes interiores");
        } else if (distancia < Math.abs(r2 - r1)) {
            System.out.println("Las circunferencias son interiores");
        } else if (distancia == 0 && r1 == r2) {
            System.out.println("Las circunferencias son concéntricas");
        }
     }
    
}
