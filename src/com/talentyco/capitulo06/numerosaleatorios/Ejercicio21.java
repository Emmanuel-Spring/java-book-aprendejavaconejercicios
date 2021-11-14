package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 *  Ejercicio 21
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * Ejemplo:
 * 2 céntimos - cara
 * 20 céntimos - cruz
 * 50 céntimos - cruz
 * 1 euro - cruz
 * 2 euros - cara
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 *
 */

public class Ejercicio21 {
    public static void main(String[] args) {

        String moneda = "";
        String posicion = "";
        int i;

        for ( i = 0; i < 5; i++) {
            switch ((int) (Math.random() * 8 )) {

                case 0:
                    moneda = "1 céntimos";
                    break;
                case 1:
                    moneda = "2 céntimos";
                    break;
                case 2:
                    moneda = "5 céntimos";
                    break;
                case 3:
                    moneda = "10 céntimos";
                    break;
                case 4:
                    moneda = "20 céntimos";
                    break;
                case 5:
                    moneda = "50 céntimos";
                    break;
                case 6:
                    moneda = "1 euro";
                    break;
                case 7:
                    moneda = "2 euro";
                    break;
                default:
            }
            switch ( (int) (Math.random() * 2)) {
                case 0:
                    posicion = "cara";
                    break;
                case 1:
                    posicion = "sello";
                    break;
                default:
            }
            System.out.println(moneda + " - " + posicion);
        }  // fin del for
    }
}
