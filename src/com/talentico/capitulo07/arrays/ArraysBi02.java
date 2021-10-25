package com.talentico.capitulo07.arrays;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class ArraysBi02 {
    public static void main(String[] args) {
         int fila;
         int columna;
         int [] [] n = {{20, 4}, {67, 33}, {0, 7}};

         for (fila = 0; fila < 3; fila++) {
             System.out.print("fila: " + fila);

             for (columna = 0; columna < 2; columna++) {
                 System.out.printf("%30d \t\t",n[fila] [columna]);
             }
             System.out.println();
         }
        }
    }

