package main;

import java.util.Scanner;

public class ejer04 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int day, month, year, age;
        System.out.println("Ingrese el dia de nacimiento");
        day = t.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        month = t.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        year = t.nextInt();
        age = 2022 - year;
        if (age > 18) {
            System.out.println("Podrás formar parte del equipo de futbol");
        } else {
            System.out.println("No tienes la edad suficiente para formar parte del equipo de futbol");
        }

    }
}
