package com.talentyco.capitulo06.numerosaleatorios.practica;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 Ejercicio 32
 Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
 del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
 espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
 la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 Por cada metro de sendero - representado por una línea - puede que haya un
 obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
 es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
 sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
 O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
 habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 Ejemplo 1:
 Introduzca la longitud del sendero en metros: 7
 | * |
 | O|
 | |
 | * |
 |* |
 | O |
 | |
 Ejemplo 2:
 Introduzca la longitud del sendero en metros: 5
 | |
 | O|
 | |
 | * |
 |* |
 * 
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio32 {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Introduzca la longitud del sendero en metros:   ");
        int longitudSendero = entrada.nextInt();

        int espaciosPorDelante = 6;

        for (int i = 0; i < longitudSendero; i++ ) {
            for (int j = 0; j < espaciosPorDelante; j++) {
                System.out.print(' ');
            }

            // Borde izquierod del sendero
            System.out.print('0');

            // Parte interior del sendero
            int posicionObstaculo = -1;
            String obstaculo = "O";   // planta por defecto

            if ((int) (Math.random() * 2) == 0 ) {   // No hay Obstaculo
                posicionObstaculo = (int) (Math.random() * 4 );
                if ((int) (Math.random() * 2 ) == 0) {   // Piedra
                    obstaculo = "O";
                }
            }

            for (int j = 0; j < 4; j++) {
                System.out.print(j == posicionObstaculo ? obstaculo : ' ');
            }

            // Borde derecho del sendero
            System.out.println('O');

            espaciosPorDelante += (int) (Math.random() * 3) -1;
        }
    }
}
