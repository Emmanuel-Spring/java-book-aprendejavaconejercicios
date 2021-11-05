package com.talentyco.capitulo06.numerosaleatorios.practica;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio06 {
    public static void main(String[] args) {

        int oportunidades = 5;
        int numeroIntroducido;
        boolean acertado = false;
        Scanner entrada = new Scanner(System.in);
        int numeroMisterioso = (int)(Math.random() * 101);

        System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. \nTienes 5 oportunidades");


        do {
            System.out.println("Introduce un número: ");
            numeroIntroducido = entrada.nextInt();
            oportunidades--;

            // numeroIntroducido = Integer.parseInt(System.console()); Se reemplaza con Scanner (Linea 31)

            if ((numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ) {
                System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }

            if ((numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ) {
                System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }

            if (numeroIntroducido == numeroMisterioso) {
                acertado = true;
                System.out.println("Felicitaciones! ¡¡¡ Has acertado !!!");
            }
        } while (!acertado && (oportunidades > 0));

        if (!acertado) {
            System.out.println("Lo siento, no has acertado, el número que estabas pensando era el " + numeroMisterioso);
        }

    }
}