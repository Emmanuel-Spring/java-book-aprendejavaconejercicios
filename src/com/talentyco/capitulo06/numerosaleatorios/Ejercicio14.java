package com.talentyco.capitulo06.numerosaleatorios;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 14
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio14 {
    public static void main(String[] args) {

        int oportunidades = 5;
        int numeroPensado;
        int minimo = 0;
        int maximo = 0;
        boolean acertado = false;
        int mayorMenorOIgual;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
        System.out.println("Pulsa la tecla INTRO cuando estés preparado.");
        //System.console().readLine();

        do {
            numeroPensado = (int) (Math.random() * (maximo - minimo) + minimo);
            System.out.println("¿ Es el " + numeroPensado + " ?");
            System.out.println("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
            mayorMenorOIgual = entrada.nextInt();
            oportunidades--;

            if ((mayorMenorOIgual == 1 ) && (oportunidades > 0 ) )
                minimo = numeroPensado + 1;

            if ((mayorMenorOIgual == 2 ) && (oportunidades > 0 ) )
                maximo = numeroPensado + 1;

            if (mayorMenorOIgual == 3) {
                acertado = true;
                System.out.println("¡Bien!  ¡¡¡ Ha acertaddo  !!!");
            }
        } while (!acertado && (oportunidades > 0 ));

        if (!acertado) {
            System.out.println("Vaya, no he conseguido acertar el número.");
        }
    }
}
