/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author UPS-SCI-002
 */
public class MiEjemplo4 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nombre, ciudad;
        int edad, nota1, nota2;
        double promedio;

        System.out.println("Ingrese su nombre porfavor:");
        nombre = e.nextLine();
        System.out.println("Ingrese su edad porfavor:");
        edad = e.nextInt();
        System.out.println("Ingrese su primera nota porfavor:");
        nota1 = e.nextInt();
        System.out.println("Ingrese su segunda nota porfavor:");
        nota2 = e.nextInt();
        e.nextLine();  //   Limpieza del Scanner
        System.out.println("Ingrese su ciudad porfavor:");
        ciudad = e.nextLine();

        promedio = (nota1 + nota2) / 2;

        System.out.printf("Me llamo: %s\nMi ciudad es: %s\nMi edad es: %d"
                + "\nMis notas son: %d y %d\nMi promedio es: %.2f ",
                 nombre, ciudad, edad, nota1, nota2, promedio);
    }
}
