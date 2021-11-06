package com.talentyco.capitulo07.arrays;

/** Java Ejemplos de usos de arrays
 *
 *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 15/10/2021/1.0
 * @book Aprende a programar en Java, 2019
 */

public class Arrays01 {
    public static void main(String[] args) {
        int [] n;  // se define n como un arrays de enteros
        n = new int[3];  // Se reserva espacio para 4 enteros

        n [0] = 26;
        n [1] = -30;
        n [2] = 0;
        n [3] = 100;

        System.out.println("\n\n");
        System.out.println("Los valores del arrays n son los siguientes:   ");
        System.out.println(n[0] + ", " + n[1] + ", " + n[2] + " y " + n[3]);

        int suma = n[0] + n[3];
        System.out.println("\nEl primer elemento del array más el último suman:   " + suma);
    }
}