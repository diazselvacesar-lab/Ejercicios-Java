package org.example;

import java.util.Scanner;

public class Ejercicio3 {

 static void main() {

  System.out.println("introduzca un número");
  Scanner teclado = new Scanner (System.in);

  int número = teclado.nextInt();

  if (número >0) {
   System.out.println("número posituivo");
  } else if (número <0){;
   System.out.println("número Negativoi");
  }else {
   System.out.println("número Neutro");

  }


 }






}