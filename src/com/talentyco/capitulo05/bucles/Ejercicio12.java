package com.talentyco.capitulo05.bucles;

import java.util.Scanner;

/** Java title Capítulo 00:

    Ejercicio:



    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa muestra los n primeros números de la serie de fibonacci. \n");
        int n;


        System.out.println("Por favor introduzca n:  ");
        n = entrada.nextInt();

        switch (n) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int aux;

                while (n > 2) {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    n--;
                }
        }
        System.out.println();
    }
}
