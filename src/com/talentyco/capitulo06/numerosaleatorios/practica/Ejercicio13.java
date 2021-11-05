package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 13
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio13 {
    public static void main(String[] args) {

        int dado1, dado2;

        do {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            System.out.println(dado1 + " " + dado2);
        } while (dado1 != dado2);
    }
}
