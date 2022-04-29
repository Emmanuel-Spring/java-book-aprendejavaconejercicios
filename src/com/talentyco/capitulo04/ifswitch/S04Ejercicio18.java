package com.talentyco.capitulo04.ifswitch;

import java.util.Scanner;

/** Java title Capítulo 04:
 * 18. Escribe un programa que diga cuál es la primera cifra de un número
 * entero introducido por teclado. Se permiten números de hasta 5 cifras.
*/


public class S04Ejercicio18 {
    public static void main(String[] args) {
        int  primera = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        Integer n = entrada.nextInt();
        //n = entrada.nextLine().length();

        if ( n < 10 ) {
            primera = n;
        }

        if (( n >= 10 ) && ( n < 100 )) {
            primera = n / 10;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
            primera = n / 100;
        }

        if (( n >= 1000 ) && (n < 10000 )) {
            primera = n / 1000;
        }

        if ( n >= 1000 ) {
            primera = n / 10000;
        }

        System.out.println("La cifra del número introducido es el : " + primera);

    }
}
