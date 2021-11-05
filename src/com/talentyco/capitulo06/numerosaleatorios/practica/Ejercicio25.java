package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 25
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25])
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio25 {
    public static void main(String[] args) {

        int i;
        int j;
        int numero;


        for ( i = 0; i < 100; i++) {
            numero = (int) (Math.random() * 191) + 10;

            // Comprueba si el número es primo
            boolean esPrimo = true;
            for ( j = 2; j < numero; j++ ) {
                if (( numero % j ) == 0 ) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(" #" + numero + "# ");
            } else if ((numero % 5) == 0) {
                System.out.print(" [" + numero + "] ");
            } else {
                System.out.print(" " + numero + " ");
            }
        }  // for
    }
}
