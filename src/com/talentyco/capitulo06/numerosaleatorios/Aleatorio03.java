package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 * 6.1 Generación de números aleatorios con y sin decimales
 *
 * Si queremos generar números enteros en lugar de números con decimales, basta con
 * hacer un casting para convertir los números de tipo double en números de tipo int.
 * Recuerda que (int)x transforma x en una variable de tipo entero; si x era de tipo float
 * o double, perdería todos los decimales.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio03 {
    public static void main(String[] args) {

        System.out.println("20 números aleatorios:\n");

        for (int i = 1; i < 20; i++) {
            System.out.print((int)(Math.random() * 10) +  " ");
        }

        System.out.println();
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