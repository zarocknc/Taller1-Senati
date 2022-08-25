package main;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A, B,canPrims,contador;
        System.out.println("ingrese rango inicial");
        A= t.nextInt();
        System.out.println("ingrese rango final");
        B=t.nextInt();
        canPrims=0;
        for(int i =A;i<=B;i++){
            contador=0;
            for (int e =1;e<=i;e++){
                if (i%e==0){
                    contador++;
                }
            }
            if(contador==2){
                canPrims++;
            }
        }
        System.out.println("La cantidad de primos en el rango es: "+canPrims);
    }
}
