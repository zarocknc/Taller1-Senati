package main;

import java.util.Scanner;

public class ejer07 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nombre;
        int clave, precio;
        float dscto, total;
        System.out.println("Ingrese el nombre del articulo");
        nombre = t.next();
        System.out.println("Ingrese la clave del articulo");
        clave = t.nextInt();
        System.out.println("Ingrese el precio");
        precio = t.nextInt();
        if (clave==01){
            dscto=0.1F;
        } else {
            dscto=0.2F;
        }
        total = precio-(precio*dscto);
        System.out.println("Articulo: "+nombre);
        System.out.println("Precio original: "+precio);
        System.out.println("Precio con dscto: "+total);
    }
}
