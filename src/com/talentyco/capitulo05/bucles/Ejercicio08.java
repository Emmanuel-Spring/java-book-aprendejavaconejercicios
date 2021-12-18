package com.talentyco.capitulo05.bucles;

import java.util.Scanner;

/** Java title Capítulo 00:

     Ejercicio 8
     Muestra la tabla de multiplicar de un número introducido por teclado

    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroIntroducido;

        System.out.println("Introduzca un número entero y le mostraré la tabla de multuplicar: ");
        numeroIntroducido = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
        }
    }
}
