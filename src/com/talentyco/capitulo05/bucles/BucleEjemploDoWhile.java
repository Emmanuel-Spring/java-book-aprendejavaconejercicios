package com.talentyco.capitulo05.bucles;

/**   El bucle do-while funciona de la misma manera que el bucle while, con la salvedad de
 que expresion se evalúa al final de la iteración. Las sentencias que encierran el bucle
 do-while, por tanto, se ejecutan como mínimo una vez. La sintaxis es la siguiente:

 */

public class BucleEjemploDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 11);
    }
}
