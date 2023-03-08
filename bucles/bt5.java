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
public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limiteInferior, limiteSuperior;

        do {
            System.out.print("Ingrese el límite inferior del intervalo: ");
            limiteInferior = sc.nextInt();

            System.out.print("Ingrese el límite superior del intervalo: ");
            limiteSuperior = sc.nextInt();

            if (limiteInferior > limiteSuperior) {
                System.out.println("Error: el límite inferior debe ser menor o igual que el límite superior");
            }
        } while (limiteInferior > limiteSuperior);

        int numero, sumaIntervalo = 0, fueraIntervalo = 0;
        boolean estaEnLimites = false;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero > limiteInferior && numero < limiteSuperior) {
                sumaIntervalo += numero;
            } else if (numero < limiteInferior || numero > limiteSuperior) {
                fueraIntervalo++;
            }

            if (numero == limiteInferior || numero == limiteSuperior) {
                estaEnLimites = true;
            }

        } while (numero != 0);

        System.out.println("La suma de los números dentro del intervalo es: " + sumaIntervalo);
        System.out.println("La cantidad de números fuera del intervalo es: " + fueraIntervalo);

        if (estaEnLimites) {
            System.out.println("Se ha introducido al menos un número igual a los límites del intervalo");
        } else {
            System.out.println("No se ha introducido ningún número igual a los límites del intervalo");
        }

        sc.close();
    }
    
}
