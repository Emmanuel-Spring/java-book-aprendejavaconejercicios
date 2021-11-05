package com.talentyco.capitulo06.numerosaleatorios.practica;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 *
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio22 {
    public static void main(String[] args) {


    }

    /**
     * Java Random Capítulo 06 : Números Aleatorios
     * <p>
     * Ejercicio 22
     * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
     * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
     * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
     * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
     * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
     * coloque una posición a la izquierda del anterior, alineado con el anterior o una
     * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
     * teclado y se supone que el usuario introducirá un dato correcto.
     * Ejemplo:
     * Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
     *
     * @author Emmanuel Nieto Muñoz
     * @ *
     * *
     * *
     * *
     * *
     * @version: 10/10/2021/1.0
     * @book Aprende Java con ejercicios, 2019, JL Sánchez González
     */

    public static class Ejercicio23 {
        public static void main(String[] args) {

            int longitud;
            int i;
            int x = 13;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Por favor, introduzca la longitud de la serpiente en ");
            System.out.println("caracteres contando la cabeza:  ");

            longitud = entrada.nextInt();

            // Pinta la cabeza
            System.out.println("        @");

            // Pinta el cuerpo
            while (longitud > 1) {
                // suma -1, 0 o 1 la variable x
                x += (int) (Math.random() * 3) - 1;


                // pinta x - 1 espacios
                for (i = 1; i < x; i++) {
                    System.out.println(" ");
                }

                // pinta el cuerpo
                System.out.println("#");
                longitud--;


            }
        }
    }
}