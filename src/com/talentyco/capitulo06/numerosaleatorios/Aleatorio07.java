package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 *
 * 6.2 Generación de palabras de forma aleatoria de
 * un conjunto dado
 *
 * ¿Cómo podríamos generar un día de la semana de forma aleatoria? En efecto, primero
 * generamos un número entre 1 y 7 ambos inclusive y luego hacemos corresponder un
 * día de la semana a cada uno de los números
 *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio07 {
    public static void main(String[] args) {

        System.out.println("Generar al azar un día de la semana:\n");

        int mano = (int) (Math.random() * 7);  // Genera un número al azar entre 0 y 7 ambos incluidos

        switch (mano) {
            case 0:
                System.out.println("lunes");
                break;
            case 1:
                System.out.println("martes");
                break;
            case 2:
                System.out.println("miércoles");
                break;
            case 3:
                System.out.println("jueves");
                break;
            case 4:
                System.out.println("viernes");
                break;
            case 5:
                System.out.println("sábado");
                break;
            case 6:
                System.out.println("domingo");
                break;
            default:

        }

    }
}
