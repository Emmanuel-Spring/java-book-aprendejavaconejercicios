package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 01
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio01 {
    public static void main(String[] args) {

        int suma = 0;

        System.out.println("Tire tres dados: ");

        // int dado = (int)(Math.random() * 6);

        for (int i = 0; i < 3; i++) {
            int tirada = (int)(Math.random() * 6) + 1;
            suma += tirada;
        }

        System.out.println("\nsuma = " + suma);

    }
}
