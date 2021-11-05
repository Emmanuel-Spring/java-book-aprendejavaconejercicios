package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 8
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio08 {
    public static void main(String[] args) {


        int resultadoPartido;
        int columnas = 3;

        for (int fila = 1; fila <= 15; fila++) {
            System.out.printf("%4d. |", fila);

            if (fila == 15) {
                columnas = 1;
            }

            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                resultadoPartido = (int) (Math.random() * 6) +1;

                switch ( resultadoPartido ) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print(" 1 |");
                        break;
                    case 4:
                    case 5:
                        System.out.print(" X |");
                        break;
                    case 6:
                        System.out.print(" 2 |");
                        break;
                    default:
                }
            }
            System.out.println();
        }
    }
}
