package com.talentyco.capitulo07.arrays;
    
/** Java title Capítulo 00:

    Ejercicio:



    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio01 {
    public static void main(String[] args) {
        int [] n; // se define n como un arrays de enteros
        n = new int[4];   // se reserva espacio para 4 enteros

        n[0] = 26;
        n[1] = -30;
        n[2] = 0;
        n[3] = 100;

        System.out.print("Los valores del array n son los siguientes: ");
        System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

        int suma = n[0] + n[3];
        System.out.println("\nEl primer elemento del array más el último es: " + suma);
    }
}
