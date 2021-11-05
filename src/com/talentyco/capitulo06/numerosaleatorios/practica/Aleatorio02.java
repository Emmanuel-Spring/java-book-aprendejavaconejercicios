package com.talentyco.capitulo06.numerosaleatorios.practica;

/** Java Random Capítulo 06 : Números Aleatorios
 *
 * Generación de números aleatorios
 * 6.1 Generación de números aleatorios con y sin decimales
 *
 * Te invito a que ejecutes varias veces el programa. Podrás observar que cada vez salen
 * números diferentes, aunque siempre están comprendidos entre 0 y 1 (incluyendo el
 * 0).
 * Pensarás que no es muy útil generar números aleatorios entre 0 y 1 si lo que queremos
 * es por ejemplo sacar una carta al azar de la baraja española; pero en realidad un
 * número decimal entre 0 y 1 es lo único que nos hace falta para generar cualquier tipo
 * de valor aleatorio siempre y cuando se manipule ese número de la forma adecuada.
 * Por ejemplo, si queremos generar valores aleatorios entre 0 y 10 (incluyendo el 0 y
 * sin llegar a 10) simplemente tendremos que correr la coma un lugar o, lo que es lo
 * mismo, multiplicar por 10.
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @book Aprende Java con ejercicios, 2019, JL Sánchez González
 */

public class Aleatorio02 {
    public static void main(String[] args) {

        System.out.println("Diez números aleatorios:\n");

        for (int i = 1; i < 20; i++) {
            System.out.println(Math.random() * 10 +  " ");

        }

        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("**********************************************");

        for (int i = 1; i < 20; i++) {

            System.out.println(Math.random() * 100 +  " ");
        }
    }
}


/* Output

9.132201051266566
4.7170490837797585
2.4840172106627856
4.1971923249278795
3.7330817276827286
2.5883595059576003
7.457440371229241
6.3846350719123
3.6043399234163065
6.334812417122633
0.5432979102357527
3.3099684514538588
2.6797477665680116
4.036249661897651
2.29455630759557
9.719624184637816
6.911108054105282
1.5705338595162577
8.331772290899611
 */