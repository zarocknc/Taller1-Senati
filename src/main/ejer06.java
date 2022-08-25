package main;

import java.util.Scanner;

public class ejer06 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int horas, pago, exceso;
        System.out.println("Ingrese las horas que ha trabajado: ");
        horas = t.nextInt();
        if (horas >40){
            exceso = horas - 40;
            pago = (exceso *20)+(40*16);
        } else {
            pago = (horas*16);
        }
        System.out.println("el pago del trabajador es de: "+pago);
    }
}
