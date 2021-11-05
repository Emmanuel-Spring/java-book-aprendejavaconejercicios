package com.talentyco.capitulo06.numerosaleatorios;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 30
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
 * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
 * una cuestión de física elemental, ninguno de los animales puede coincidir
 * en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
 * que como mínimo serán de 4 unidades.
 * Ejemplo:
 * Por favor, introduzca la altura de la pecera (como mínimo 4): 4
 * Ahora introduzca la anchura (como mínimo 4): 7
 * * * * * * * *
 * * @ & *
 * * $ *
 * * * * * * * *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):  ");
        int alto = entrada.nextInt();

        System.out.println("Por favor, introduzca el ancho de la pecera (como mínimo 4):  ");
        int ancho = entrada.nextInt();

        int posicion = 0;
        int posicionPez;
        int posicionCaballito;
        int posicionCaracola;

        do {
            posicionPez = (int) (Math.random() * (alto - 2) * (alto - 2));
            posicionCaballito = (int) (Math.random() * (alto - 2) * (alto - 2));
            posicionCaracola = (int) (Math.random() * (alto - 2) * (alto - 2));
        } while (
                (posicionPez == posicionCaballito) ||
                (posicionPez == posicionCaracola) ||
                (posicionCaballito == posicionCaracola));

        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 2; i < alto; i++) {
            System.out.print("*");
            for (int j = 2; j < ancho; j++) {
                if (posicion == posicionPez) {
                    System.out.print("&");
                } else if (posicion == posicionCaracola) {
                    System.out.print("@");
                } else if (posicion == posicionCaballito) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
                posicion ++;
            }
            System.out.println("*");
        }
        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
