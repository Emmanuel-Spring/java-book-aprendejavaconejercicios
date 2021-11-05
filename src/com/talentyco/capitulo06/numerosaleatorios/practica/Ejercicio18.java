package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 18
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio18 {
    public static void main(String[] args) {

        int c1;
        int c2;
        int c3;
        String color1 = "";
        String color2 = "";
        String color3 = "";

        do {
            c1 = (int)(Math.random() * 6);
            c2 = (int)(Math.random() * 6);
            c3 = (int)(Math.random() * 6);
        } while ( (c1 == c2) || (c1 == c3) || (c2 == c3) );

        switch (c1) {
            case 0:
                color1 = "Rojo";
                break;
            case 1:
                color1 = "Azul";
                break;
            case 2:
                color1 = "Verde";
                break;
            case 3:
                color1 = "Amarillo";
                break;
            case 4:
                color1 = "Violeta";
                break;
            case 5:
                color1 = "Naranja";
                break;
            default:
        }

        switch (c2) {
            case 0:
                color2 = "Rojo";
                break;
            case 1:
                color2 = "Azul";
                break;
            case 2:
                color2 = "Verde";
                break;
            case 3:
                color2 = "Amarillo";
                break;
            case 4:
                color2 = "Violeta";
                break;
            case 5:
                color2 = "Naranja";
                break;
            default:
        }

        switch (c3) {
            case 0:
                color3 = "Rojo";
                break;
            case 1:
                color3 = "Azul";
                break;
            case 2:
                color3 = "Verde";
                break;
            case 3:
                color3 = "Amarillo";
                break;
            case 4:
                color3 = "Violeta";
                break;
            case 5:
                color3 = "Naranja";
                break;
            default:
        }

        System.out.println( color1 + ", " + color2 + ", " + color3);
    }
}
