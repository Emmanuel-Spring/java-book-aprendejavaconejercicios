package com.talentyco.capitulo05.bucles;

import java.util.Scanner;

/** Java title Capítulo 05: Bucles

     Ejercicio 7
     Realiza el control de acceso a una caja fuerte. La combinación será un
     número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
     acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
     y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     Tendremos cuatro oportunidades para abrir la caja fuerte.

    @author Emmanuel Nieto Muñoz
    @version 17/12/2021/1.0
    @book Aprende Java con ejercicios, 2019, JL Sánchez González
*/


public class Ejercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int intentos = 4;
        int numerosIntroducidos;
        boolean acertado = false;

        do {
            System.out.println("Introduzca la clave de la caja fuerte: ");
            numerosIntroducidos = entrada.nextInt();

            if (numerosIntroducidos == 8888) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos --;

        } while ((intentos > 0) && (!acertado));

            if (acertado) {
                System.out.println("Ha abierto la caja fuerte");
            } else {
                System.out.println("Lo siento, ha agotado las 4 oportunidades.");
            }
        }
}
