package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 *
 * 6.1 Generación de números aleatorios con y sin decimales
 *
 * Para generar valores aleatorios utilizaremos Math.random(). Esta función genera un
 * número con decimales (de tipo double) en el intervalo [0 - 1), es decir, genera un número
 * mayor o igual que 0 y menor que 1.
 *
 * El siguiente programa genera diez números aleatorios:
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio01 {
    public static void main(String[] args) {

        System.out.println("Diez números aleatorios:\n");

        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random());
        }
    }
}


/* Output

0.5967752783990864
0.8424327108716188
0.35596453443271736
0.16664126567003734
0.9868672461247837
0.8613163876054128
0.12413012107789823
0.49528400693384134
0.961736426670397
0.3420308101622582
 */