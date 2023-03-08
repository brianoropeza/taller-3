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
public class T11 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario la cantidad de alumnos que participarán en el viaje
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = sc.nextInt();
        
        int costoTotal;
        int costoPorAlumno;
        
        // Determinar el costo del viaje por alumno y el costo total del servicio de la compañía de autobuses
        if (cantidadAlumnos >= 100) {
            costoTotal = cantidadAlumnos * 65;
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
            costoTotal = cantidadAlumnos * 70;
        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
            costoTotal = cantidadAlumnos * 95;
        } else {
            costoTotal = 4000;
        }
        
        // Calcular el costo por alumno dividiendo el costo total del servicio entre la cantidad de alumnos
        costoPorAlumno = costoTotal / cantidadAlumnos;
        
        // Mostrar en pantalla los resultados
        System.out.println("Costo total del servicio de la compañía de autobuses: " + costoTotal + " euros.");
        System.out.println("Costo por alumno: " + costoPorAlumno + " euros.");
    }
    
}
