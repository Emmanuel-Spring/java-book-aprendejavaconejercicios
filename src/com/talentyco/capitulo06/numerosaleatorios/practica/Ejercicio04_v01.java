package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 4
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio04_v01 {
    public static void main(String[] args) {

        System.out.println("Diez números aleatorios de 1 al 10 (incluídos):\n");

        for (int i = 1; i <= 20; i++) {
            System.out.print((int)(Math.random() * 10) + 1 + ",  ");
        }
        System.out.println();
    }
}

