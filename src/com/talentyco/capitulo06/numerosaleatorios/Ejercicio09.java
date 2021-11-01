package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio09 {
    public static void main(String[] args) {

        int n = 0;
        int cuentaNumeros = 0;

        while (n != 24) {
            n = (int) (Math.random() * 51) * 2;
            System.out.print(n + " ");
            cuentaNumeros ++;
        }
        System.out.println("\nSe han generado " +cuentaNumeros + " números.");
    }
}
