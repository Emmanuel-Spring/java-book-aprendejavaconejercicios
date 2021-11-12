package com.talentyco.capitulo06.numerosaleatorios;

import java.util.Scanner;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 *  Ejercicio 20
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * Ejemplo:
 * Por favor, indique la capacidad de la cuba en litros: 3
 * * *
 * *====*
 * *====*
 * ******
 * La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio20 {
    public static void main(String[] args) {

        int capacidad;
        int litros;
        int i;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, ingrese la capacidad de la cuba en litros: ");
        capacidad = entrada.nextInt();

        //  Rellena la cuba con unos litros aleatorios
        // teniendo en cuenta no pasarse de la capacidad
        litros = ( int ) ( Math.random() * ( capacidad + 1 ));

        for (i = 0; i < capacidad; i++) {
            if ( i < (capacidad - litros)) {
                System.out.println("#    #");  // Capacidad de la cuba vacía
            } else {
                System.out.println("======");  //  capacidad de la cuba con n litros de agua
            }
        }
        System.out.println("######");  // fondo de la cuba, es la base
        System.out.println("La cuba tiene una capacidad de  " + capacidad);
        System.out.println(" litros y contiene " + litros + " litros de agua.");
    }
}
