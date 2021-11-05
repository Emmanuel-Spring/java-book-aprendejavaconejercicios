package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 * 6.1 Generación de números aleatorios con y sin decimales
 *
 * La salida del programa debe ser algo muy parecido a esto:
 *
 * 20 números aleatorios entre 0 y 9 (sin decimales):
 * 0 8 0 3 8 8 7 3 2 0 8 2 1 2 9 0 6 4 5 4
 * ¿Y si en lugar de generar números enteros entre 0 y 9 queremos generar números
 * entre 1 y 10? Como habrás podido adivinar, simplemente habría que sumar 1 al
 * número generado, de esta forma se “desplazan un paso” los valores generados al
 * azar, de tal forma que el mínimo valor que se produce sería el 0 + 1 = 1 y el máximo
 * sería 9 + 1 = 10.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio04 {
    public static void main(String[] args) {

        System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):\n");

        for (int i = 1; i <= 20; i++) {
            System.out.print((int)(Math.random() * 10 + 1) +  " ");
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