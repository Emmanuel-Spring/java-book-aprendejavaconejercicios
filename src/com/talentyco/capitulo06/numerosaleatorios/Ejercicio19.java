package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 19
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio19 {
    public static void main(String[] args) {

        int numero;
        int maximoPar = -100;
        int minimoPar = 200;
        int suma = 0;
        int i;

        for (i = 0; i < 50; i++) {
            numero = (int) (Math.random() * 301) - 100;

            System.out.print(numero + " ");

            if (numero % 2 == 0) {   // El número es par
                if (numero > maximoPar) maximoPar = numero;
            } else {   // El número es impar
                if (numero < minimoPar) minimoPar = numero;
            }
            suma += numero;
        }
        System.out.println("\nMáximo de los pares: " + maximoPar);
        System.out.println("Mínimo de los impares: " + minimoPar);
        System.out.println("Media: " + suma / 50 );
    }
}
