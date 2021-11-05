package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 * Ejercicio 5
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio05_v01 {
    public static void main(String[] args) {

        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int n;

        for (int i = 0; i < 50; i++) {
            n = (int)(Math.random() * 100) + 100;
            System.out.println(n + " ");
            suma += n;

            if (n < minimo) {
                minimo = n;
            }

            if (n > maximo) {
                maximo = n;
            }
        }

        System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);


    }

}
