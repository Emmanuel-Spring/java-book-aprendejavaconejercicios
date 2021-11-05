package com.talentyco.capitulo06.numerosaleatorios.practica;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 Ejercicio 27
 Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 error.
 Ejemplo 1:
 Turno del jugador (introduzca piedra, papel o tijera): papel
 Turno del ordenador: papel
 Empate
 Ejemplo 2:
 Turno del jugador (introduzca piedra, papel o tijera): papel
 Turno del ordenador: tijera
 Gana el ordenador
 Ejemplo 3:
 Turno del jugador (introduzca piedra, papel o tijera): piedra
 Turno del ordenador: tijera
 Gana el jugador

 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio27 {
    public static void main(String[] args) {

        String jugador;
        int mano;
        String ordenador = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Turno del jugador (introduzca piedra, papel o tijera): ");
        jugador = entrada.nextLine();

        mano = (int) (Math.random() * 3 );

        switch ( mano ) {
            case 0:
                ordenador = "piedra";
                break;
            case 1:
                ordenador = "papel";
                break;
            case 2:
                ordenador = "tijera";
                break;
            default:
        }

        System.out.println("Turno del computador: "  + ordenador);

        if ( jugador.equals( ordenador ) ) {
            System.out.println( "Empate" );
        } else {
            int ganador = 2;
            switch ( jugador ) {
                case "piedra":
                    if (ordenador.equals("tijera")) {
                        ganador = 1;
                    }
                    break;
                case "papel":
                    if (ordenador.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijera":
                    if (ordenador.equals("papel")) {
                        ganador = 1;
                    }
                    break;
                default:
            }

            if ( ganador == 1) {
                System.out.println("Gana el jugador.");
            } else {
                System.out.println("Gana el computador.");
            }
        }
    }
}
