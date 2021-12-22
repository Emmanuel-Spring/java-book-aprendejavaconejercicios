package com.talentyco.capitulo05.bucles;

import java.util.Scanner;

/** Java title Capítulo 05: Bucles

    Ejercicio:



    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numeros = 0;
        double numeroIntroducido = 0;
        double suma = 0;

        System.out.println("Este programa calcula la media de los números  positivos introducidos: ");
        System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo )");

        while (numeroIntroducido >= 0) {
            numeroIntroducido = entrada.nextDouble();
            numeros++;
            suma += numeroIntroducido;
        }
        System.out.println("La media de los números positivos introducidos es " +
                (suma - numeroIntroducido) / (numeros - 1));
    }
}
