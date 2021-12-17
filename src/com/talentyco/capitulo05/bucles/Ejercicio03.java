package com.talentyco.capitulo05.bucles;
    
/** Java title Capítulo 05: Bucles

     Ejercicio 3
     Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio03 {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
            i += 5;
        } while (i <= 100);
    }
}
