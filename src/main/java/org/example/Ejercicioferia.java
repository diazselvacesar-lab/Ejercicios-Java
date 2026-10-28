package org.example;

import java.awt.print.Printable;
import java.util.Scanner;

public class Ejercicioferia {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("BIENVENIDO AL RATÓN JUGUETÓN");
        int altura = teclado.nextInt();

        if (altura < 140 && altura >= 0) {
            System.out.print("Lo siento NO puedes montar en la atracción. te faltan " + (140 - altura) + "cm de altura");
        } else {
            if (altura < 0 || altura > 230) {
                System.out.print("error de lectura. Baja de la báscula y vuelve a subir");
            } else {
                teclado.nextLine();
                System.out.println(" Introduce tu peso");
                float peso = teclado.nextFloat();
                float peso_minimo = altura * 2 / 8;

                if (peso < peso_minimo) {
                    System.out.println(" lo siento, te faltan" + (peso_minimo - peso) + " kilos para subir");
                } else {
                    if (peso > 120) {
                        System.out.println(" lo siento te sobran " + (peso - 120) + " kilos para subir");
                    } else {
                        System.out.println(" Puedes Subir. pesọ_minimo = "+peso_minimo);
                    }
                }
            }


        }


    }

}