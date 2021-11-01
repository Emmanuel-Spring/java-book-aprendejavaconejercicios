package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 *
 * 6.2 Generación de palabras de forma aleatoria de
 * un conjunto dado
 *
 * Hemos visto cómo generar números aleatorios con y sin decimales y en diferentes
 * intervalos. Vamos a producir ahora de forma aleatoria una palabra - piedra, papel o
 * tijera - generando primero un número entero entre 0 y 2 y posteriormente haciendo
 * corresponder una palabra a cada número.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio06 {
    public static void main(String[] args) {

        System.out.println("Generar al azar piedra, papel o tijera:\n");

        int mano = (int) (Math.random() * 3);  // Genera un número al azar entre 0 y 2 ambos incluidos

        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
            default:

        }

    }
}
