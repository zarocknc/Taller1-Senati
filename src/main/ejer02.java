package main;

import java.util.Scanner;

public class ejer02 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int c1,c2;
        System.out.println("Ingrese la calificacion 1:");
        c1=t.nextInt();
        System.out.println("Ingrese la calificacion 2:");
        c2 = t.nextInt();

        if(c1>80 && c2>80){
            System.out.println("El alumno fue aprobado");
        } else {
            System.out.println("El alumno NO fue aprobado");
        }
    }
}
