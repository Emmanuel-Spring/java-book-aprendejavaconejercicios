package com.talentyco.capitulo05.bucles;

/**  5.1 Bucle for
        Se suele utilizar cuando se conoce previamente el número exacto de iteraciones
        (repeticiones) que se van a realizar. La sintaxis es la siguiente:
        for (expresion1 ; expresion2 ; expresion3) {
        sentencias
        }
        Justo al principio se ejecuta expresion1 y normalmente se usa para inicializar una
        variable. El bucle se repite mientras se cumple expresion2 y en cada iteración del bucle
        se ejecuta expresion3, que suele ser el incremento o decremento de una variable. Con
        un ejemplo se verá mucho más claro.
 */

public class BucleEjemploFor {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++)
            System.out.println("i = " + i);
    }
}
