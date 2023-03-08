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
public class bt8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Presiona ENTER para comenzar el cronómetro");
        sc.nextLine();

        int horas = 0, minutos = 0, segundos = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            segundos++;
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
    }

}
