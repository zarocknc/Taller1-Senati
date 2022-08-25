package main;

import java.util.Scanner;

public class ejer08 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num;
        int i=1, acumulador=1;
        System.out.println("ingrese un numero");
        num = t.nextInt();
        while (i<=num){
            acumulador*=i;
            i++;
        }
        System.out.println("El factorial del numero es: "+acumulador);
    }
}
