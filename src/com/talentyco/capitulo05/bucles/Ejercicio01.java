package com.talentyco.capitulo05.bucles;
    
/** Java title Capítulo 00:

 Ejercicio 1
 Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

 @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio01 {
    public static void main(String[] args) {
        int numeros;

        for (numeros = 5; numeros < 101; numeros += 5 ) {
            System.out.println("numeros = " + numeros);
        }
    }
}
