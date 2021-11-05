package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 *
 * 6. Números aleatorios
 * Los números aleatorios se utilizan con frecuencia en programación para emular el
 * comportamiento de algún fenómeno natural, el resultado de un juego de azar o, en
 * general, para generar cualquier valor impredecible a priori.
 * Por ejemplo, se pueden utilizar números aleatorios para generar tiradas de dados de
 * tal forma que, de antemano, no se puede saber el resultado. Antes de tirar un dado no
 * sabemos si saldrá un 3 o un 5; se tratará pues de un número impredecible; lo que sí
 * sabemos es que saldrá un número entre el 1 y el 6, es decir, podemos acotar el rango
 * de los valores que vamos a obtener de forma aleatoria.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio00 {
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