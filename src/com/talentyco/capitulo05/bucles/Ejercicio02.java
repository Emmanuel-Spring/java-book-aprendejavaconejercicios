package com.talentyco.capitulo05.bucles;
    
/** Java title Capítulo 05: Bucles

    Ejercicio 2
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio02 {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 100) {
            System.out.println(i);
            i += 5;
        }
    }
}
