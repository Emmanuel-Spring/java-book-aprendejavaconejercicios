package com.talentyco.capitulo06.numerosaleatorios;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 17
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * Ejemplo:
 * Por favor, introduzca la altura de la pecera (como mínimo 4): 4
 * Ahora introduzca la anchura (como mínimo 4): 7
 * * * * * * * *
 * *           *
 * *     &     *
 * * * * * * * *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio17 {
    public static void main(String[] args) {

        int alto;
        int ancho;
        int posicion = 0;
        int i;
        int j;
        int posicionPecera;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduzca la anchura de la pecera (cómo mínimo 4 cm): ");
        ancho = entrada.nextInt();

        System.out.println("Por favor, introduzca la altura de la pecera (cómo mínimo 4 cm): ");
        alto = entrada.nextInt();

        posicionPecera = (int)(Math.random() * (alto - 2) * ( ancho - 2));

        //  Pinta la parte superior    //////////////
        for ( i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();


        //  Pinta la parte Central    //////////////
        for (i = 2; i < alto; i++) {
            System.out.println("*");  // parte izquierda de la pecera

        for (j = 2; j < ancho; j++) {
            if (posicion == posicionPecera) {
                System.out.println("&");
            } else {
                System.out.print(" ");
            }
            posicion++;
        }  // for j
        System.out.println("*");  // parte derecha de la pecera
    }  // for i

        //  Pinta la parte Inferior    //////////////
        for (i = 0; i < ancho; i++) {
            System.out.print("*");
        }
}
}