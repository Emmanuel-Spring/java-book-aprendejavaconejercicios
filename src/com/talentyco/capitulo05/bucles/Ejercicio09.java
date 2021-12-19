package com.talentyco.capitulo05.bucles;

import java.util.Scanner;

/** Java title Capítulo 00:

    Ejercicio:



    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroDeDigitos = 1, n, numeroIntroducido;

        System.out.println("Introduzca un número entero y le diré cuántos digitos tiene: ");
        numeroIntroducido = entrada.nextInt();

        n = numeroIntroducido;

        while (n > 10) {
            n /= 10;
            numeroDeDigitos++;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos/s.");



    }
}
