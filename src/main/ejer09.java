package main;

import java.util.Scanner;

public class ejer09 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int ini,end,a,b,canCapi;
        System.out.println("ingrese el numero inicial");

        ini = t.nextInt();
        System.out.println("Ingrese el numero final");
        end = t.nextInt();
        canCapi=0;
        for (int i = ini;i<=end;i++){
            a = (i-(i%100))/100;
            b = i%10;
            if (a==b){
                canCapi++;
            }
        }
        System.out.println("la cantidad de numeros capicua es: "+canCapi);
    }
}
