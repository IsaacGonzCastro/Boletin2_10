
package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
    int dinero, billete100 ,billete20 , billete5 ,monedas;
    Scanner obx = new Scanner (System.in);
    System.out.println("introduce o Diñeiro enteiro  :");
    dinero = obx.nextInt();
    
    billete100 = dinero/100;
    dinero = dinero - billete100*100;
    
    billete20 = dinero/20;
    dinero = dinero - billete20*20;
    
    billete5 = dinero/5;
    dinero = dinero-billete5*5;
    
    monedas = dinero/1;
    dinero = dinero- monedas*1;
   
    System.out.println("Billetes 100 ="+ billete100);
    System.out.println("Billetes 20 ="+ billete20);
    System.out.println("Billetes 5 ="+ billete5);
    System.out.println("Moedas 1 ="+ monedas);
    }
    
}
