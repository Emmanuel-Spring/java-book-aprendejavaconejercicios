package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 23
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * Ejemplo 1:
 * Q J 7 J As
 * Ejemplo 2:
 * K 8 J As 7
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio23 {
    public static void main(String[] args) {

        String dado = "";
        int i;

        for ( i = 0; i < 5; i++) {
            switch ((int) (Math.random() * 6)) {
                case 0:
                    dado = "As";
                    break;
                case 1:
                    dado = "K";
                    break;
                case 2:
                    dado = "Q";
                    break;
                case 3:
                    dado = "J";
                    break;
                case 4:
                    dado = "7";
                    break;
                case 5:
                    dado = "8";
                    break;
                default:
            }
            System.out.print(dado + " ");
        }


    }

}
