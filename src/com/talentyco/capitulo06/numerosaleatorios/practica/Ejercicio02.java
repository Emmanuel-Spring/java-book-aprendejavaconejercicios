package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 02
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio02 {
    public static void main(String[] args) {

        String palo = "";
        String carta = "";

        int numeroPalo = (int)(Math.random() * 4) + 1;

        switch (numeroPalo) {
            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "trébol";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo = "corazones";
                break;
            default:
        }

        int numeroCarta = (int)(Math.random() * 13) + 1 ;
        switch (numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta + " de " + palo);
    }
}
