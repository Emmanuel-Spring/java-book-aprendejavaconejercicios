package com.talentyco.capitulo06.numerosaleatorios;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Ejercicio 3
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Ejercicio03 {
    public static void main(String[] args) {


        String palo = "";
        String carta = "";

        int numeroPalo = (int)(Math.random() * 4) + 1;

        switch (numeroPalo) {
            case 1:
                palo = "bastos";
                break;
            case 2:
                palo = "oros";
                break;
            case 3:
                palo = "copas";
                break;
            case 4:
                palo = "espadas";
                break;
            default:
        }

        int numeroCarta = (int)(Math.random() * 10) + 1 ;
        switch (numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }

        System.out.println(carta + " de " + palo);
    }
}
