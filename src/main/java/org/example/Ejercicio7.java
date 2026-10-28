package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduce si hay aceite [S/N]");
        char aceite = teclado.next().charAt(0);

        System.out.println(" Introduce si hay tomate [S/N]");
        char tomate = teclado.next().charAt(0);

        System.out.println(" Introduce si hay jamón [S/N]");
        char jamón = teclado.next().charAt(0);

        if (aceite == 'N' || tomate == 'N' || jamón == 'N') {
            System.out.println("comprar ¡¡");
        } else {
            System.out.println("NO comprar ¡¡");
        }


    }

    }