package org.example;

import java.util.Scanner;

public class Prueba2 {

    static void main() {
        System.out.println("introduzca las horas");
        Scanner teclado = new Scanner(System.in);
        float horas = teclado.nextFloat();

        System.out.println("introduzca la tarifa por horas");
        float tarifa = teclado.nextFloat();


        System.out.println("salario= " + (horas * tarifa));


    }}