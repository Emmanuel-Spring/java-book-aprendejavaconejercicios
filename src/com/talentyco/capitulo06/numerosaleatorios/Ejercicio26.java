package com.talentyco.capitulo06.numerosaleatorios;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 Ejercicio 26
 Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 de la tableta.
 Ejemplo 1:
 Introduzca la anchura de la tableta: 6
 Introduzca la altura de la tableta: 4
 ******
 *****
 ******
 ******
 * Ejemplo 2:
 * Introduzca la anchura de la tableta: 7
 * Introduzca la altura de la tableta: 3
 * *******
 * *******
 * ******
 * Ejemplo 3:
 * Introduzca la anchura de la tableta: 5
 * Introduzca la altura de la tableta: 5
 * ** **
 * *****
 * *****
 * *****
 * *****
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio26 {
    public static void main(String[] args) {

        int anchura;
        int altura;
        int posicionMordisco;
        int i;
        int j;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la anchura de la tableta: ");
        anchura = entrada.nextInt();

        System.out.println("Introduzca la altura de la tableta: ");
        altura = entrada.nextInt();

        posicionMordisco = (int) (Math.random() * (anchura * 2 + (altura - 2) * 2));
        int posicion = 0;
        for ( i = 0; i < altura; i++) {
            for ( j = 0; j < anchura; j++) {
                boolean estaEnBorde = ( i == 0) || ( i == altura -1) || ( j == 0 ) || ( j == anchura - 1);

                if ((posicion == posicionMordisco) && estaEnBorde) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (estaEnBorde) {
                    posicion ++;
                }
            }
            System.out.println();
        }
    }
}
