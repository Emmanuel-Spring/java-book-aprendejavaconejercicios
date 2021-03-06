package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 12
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio12 {
    public static void main(String[] args) throws InterruptedException {

            int linea = 0;

            System.out.print("\033[32m");

            for (int i = 0; i < 800; i++) {
                System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));

                if (linea ++ == 60) {
                    linea = 0;
                   Thread.sleep(50);
                    System.out.println();
                }
            }
        }
    }

