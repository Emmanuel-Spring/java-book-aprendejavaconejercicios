package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 11
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        int nota;
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;

        for (int i = 0; i < 20; i ++) {

            nota = (int) (Math.random() * 5);

            switch (nota) {
                case 0:
                    System.out.println("suspenso");
                    suspensos++;
                    break;
                case 1:
                    System.out.println("Suficiente");
                    suficientes++;
                    break;
                case 2:
                    System.out.println("Bien");
                    bienes++;
                    break;
                case 3:
                    System.out.println("Notable");
                    notables++;
                    break;
                case 4:
                    System.out.println("Sobresaleinte");
                    sobresalientes++;
                    break;
                default:
            }
        }
        System.out.println("suspensos = " + suspensos);
        System.out.println("suficientes = " + suficientes);
        System.out.println("bienes = " + bienes);
        System.out.println("notables = " + notables);
        System.out.println("sobresalientes = " + sobresalientes);
    }
}
