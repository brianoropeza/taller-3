/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de10;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class T12 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la duración de la llamada en minutos: ");
        int duracionLlamada = sc.nextInt();

        System.out.print("Introduzca el día de la semana (L, M, X, J, V, S, D): ");
        char diaSemana = sc.next().charAt(0);
        System.out.print("Introduzca el turno (M para mañana, T para tarde): ");
        char turno = sc.next().charAt(0);

        double costoLlamada = 0;
        if (duracionLlamada <= 5) {
            costoLlamada = 1;
        } else if (duracionLlamada <= 8) {
            costoLlamada = 1 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costoLlamada = 1 + 3.2 + (duracionLlamada - 8) * 0.7;
        } else {
            costoLlamada = 1 + 3.2 + 1.4 + (duracionLlamada - 10) * 0.5;
        }

      
        double impuesto = 0;
        if (diaSemana == 'D') {
            impuesto = costoLlamada * 0.03;
        } else if (turno == 'M') {
            impuesto = costoLlamada * 0.15;
        } else {
            impuesto = costoLlamada * 0.1;
        }

        
        double costoTotal = costoLlamada + impuesto;

       
        System.out.println("Costo de la llamada: " + costoLlamada + " euros");
        System.out.println("Impuesto: " + impuesto + " euros");
        System.out.println("Costo total: " + costoTotal + " euros");

       
    }
}
    

