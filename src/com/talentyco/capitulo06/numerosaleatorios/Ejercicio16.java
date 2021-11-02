package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 16
 * Realiza un simulador de máquina tragamonedas simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * Ejemplo 1:
 * diamante diamante limón
 * Bien, ha recuperado su moneda
 * Ejemplo 2:
 * herradura campana diamante
 * Lo siento, ha perdido
 * Ejemplo 3:
 * corazón corazón corazón
 * Enhorabuena, ha ganado 10 monedas
 *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio16 {
    public static void main(String[] args) {

        int figura;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;

        for (int i = 0; i < 3; i++) {
            figura = (int)(5 * Math.random());

            switch (figura) {
                case 0:
                    System.out.println("corazon");
                    break;
                case 1:
                    System.out.println("diamante");
                    break;
                case 2:
                    System.out.println("herradura");
                    break;
                case 3:
                    System.out.println("campana");
                    break;
                case 4:
                    System.out.println("limón");
                    break;
                default:
            }

            switch (i) {

                case 0:
                    figura1 = figura;
                    break;
                case 1:
                    figura2 = figura;
                    break;
                case 2:
                    figura3 = figura;
                    break;
                default:
            }
        }
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.println("\nLo siento, Ha perdido !!!!!!");
        } else if ((figura1 == figura2) && (figura2 == figura3))  {
            System.out.println("\nEnhorabuena Chaval, ha ganado 10 dólares.");
        } else {
            System.out.println("\nBien, ha recuperado una moneda !!!");
        }
    }
}