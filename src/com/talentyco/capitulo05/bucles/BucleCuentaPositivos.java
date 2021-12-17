package com.talentyco.capitulo05.bucles;

/**  En el siguiente ejemplo se cuentan y se suman los números que se van introduciendo
 por teclado. Para indicarle al programa que debe dejar de pedir números, el usuario
 debe introducir un número negativo; esa será la condición de salida del bucle. Observa
 que el bucle se repite mientras el número introducido sea mayor o igual que cero.
 */

import java.util.Scanner;

public class BucleCuentaPositivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, vaya introduciendo números y pulsando INTRO");
        System.out.println("Para terminar, introduzca un número negativo.");
        
        int numeroIntroducido = 0;
        int cuentaNumero = 0;
        int suma = 0;
        
        while ( numeroIntroducido >= 0 ) {
            numeroIntroducido = scanner.nextInt();
            cuentaNumero ++;
            suma += numeroIntroducido;
        }

        System.out.println("has introducido " + (cuentaNumero - 1 ) + " números positivos.");
        System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
        
    }
}
