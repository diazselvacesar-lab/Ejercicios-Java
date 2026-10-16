package org.example;

import java.util.Scanner;

public class Votar {

    static void main() {
        System.out.println("Introduce una edad ");
        Scanner teclado = new Scanner (System.in);
        int edad = teclado.nextInt();

        if (edad >= 18){
            System.out.println("se puede votar");
        } else {
            if (edad < 18) {
                System.out.println("No se puede votar");
            }

        }

    }

}
