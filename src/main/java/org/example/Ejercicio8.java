package org.example;

import java.util.Scanner;

public class Ejercicio8 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int l1= teclado.nextInt();
        int l2= teclado.nextInt();
        int l3= teclado.nextInt ();

            if (l1 == l2 && l1 == l3) {
                System.out.println("Equilatero");
            } else if (l1 != l2 && l1 != l3 && l2 != l3){
                System.out.println("Escaleno");
            }else {
                System.out.print("Isosceles");

            }


    }


}