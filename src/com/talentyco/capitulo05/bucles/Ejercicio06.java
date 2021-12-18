package com.talentyco.capitulo05.bucles;
    
/** Java title Capítulo 05: Bucles

     Ejercicio 6
     Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
     do-while.

    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio06 {
    public static void main(String[] args) {

        int i = 320;

        do {
            System.out.println("i = " + i);
            i -= 20;
        } while (i >= 160);
    }
}
