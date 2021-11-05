package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 9
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
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
