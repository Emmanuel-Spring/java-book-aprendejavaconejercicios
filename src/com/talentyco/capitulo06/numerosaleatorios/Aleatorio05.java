package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 * 6.1 Generación de números aleatorios con y sin decimales
 *
 * Vamos a ponerlo un poco más difícil. Ahora vamos a generar números enteros entre
 * 50 y 60 ambos incluidos. Primero multiplicamos Math.random() por 11, con lo que
 * obtenemos números decimales entre 0 y 10.9999… (sin llegar nunca hasta 11). Luego
 * desplazamos ese intervalo sumando 50 por lo que obtenemos números decimales
 * entre 50 y 60.9999… Por último, quitamos los decimales haciendo casting y voilà, ya
 * tenemos números enteros aleatorios entre 50 y 60 ambos incluidos.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio05 {
    public static void main(String[] args) {

        System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):\n");

        for (int i = 1; i <= 20; i++) {
            System.out.print(((int)(Math.random() * 11) +50) +  " ");
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