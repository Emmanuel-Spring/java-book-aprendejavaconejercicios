package com.talentyco.capitulo05.bucles;


import java.util.Scanner;

/** Veamos otro ejemplo. En este caso se van a ir leyendo números de teclado mientras
        el número introducido sea par; el programa parará, por tanto, cuando se introduzca
        un número impar.
 */

public class BucleTerminaCuandoEsImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Dime un número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0 ) {  // Comprueba que el número introducido es par
                System.out.println("Qué bonito es el : " + numero);
            } else {
                System.out.println("No me gustan los números impares, adiós.");
            }
        } while (numero % 2 == 0 );


    }
}
