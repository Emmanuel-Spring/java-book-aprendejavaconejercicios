package com.talentyco.capitulo06.numerosaleatorios.practica;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 24
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 406783
 * 7
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 406783
 * 3
 * Ejemplo 3:
 * Por favor, introduzca un número entero positivo: 406783
 * 0
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio24 {
    public static void main(String[] args) {

        Long numero;
        Long numeroIntroducido;
        int posicion;
        int longitud;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo: ");
        numeroIntroducido = entrada.nextLong();

        numero = numeroIntroducido;

        // calcula la longitud del número
        longitud = 0;

        do {
            numero /= 10;
            longitud++;
        } while (numero > 0);

        // elige una posición al azar del número
        posicion = (int) (Math.random() * longitud ) + 1;

        // extrae el dígito de esa posición
        System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
    }
}
