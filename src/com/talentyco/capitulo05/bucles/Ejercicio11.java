package com.talentyco.capitulo05.bucles;

import java.util.Scanner;

/** Java title Capítulo 05: Bucles

    Ejercicio:



    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número:  ");
        int numeroIntroducido = entrada.nextInt();

        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}
