package com.talentico.capitulo07.arrays;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class ArraysBi01 {
    public static void main(String[] args) {

            int[][] n = new int[3][2];   // Arrays de 3 filas x 2 columnas

            n[0][0] = 20;
            n[1][0] = 67;
            n[1][1] = 33;
            n[2][1] = 7;

            int fila;
            int columna;

            for (fila = 0; fila < 2; fila++) {
                System.out.println("Filas: " + fila);

                for (columna = 0; columna < 2; columna++) {
                    System.out.printf("%10d ", n[fila][columna]);
                }
                System.out.println();
            }
        }
    }
