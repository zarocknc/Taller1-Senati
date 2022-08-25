package main;

import java.util.Scanner;

public class ejer01 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int sueldo;
        double nuevoSueldo;
        float aumento;
        System.out.println("ingrese el sueldo:");
        sueldo = t.nextInt();

        if(sueldo<1000){
            aumento=0.15F;
        } else {
            aumento=0.12F;
        }
        nuevoSueldo=sueldo+(sueldo*aumento);
        System.out.println("El nuevo sueldo del trabajador es de: "+nuevoSueldo+" nuevos soles");
    }
}
