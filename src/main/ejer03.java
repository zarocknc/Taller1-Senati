package main;

import java.util.Scanner;

public class ejer03 {
    public static void main(String[] args) {
        int Cbarra, cantidad, costo , Reducir, cantidadACobrar;
        float dscto;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el codigo de barras");
        Cbarra = t.nextInt();
        System.out.println("ingrese la cantidad");
        cantidad = t.nextInt();
        System.out.println("ingrese el costo");
        costo = t.nextInt();

        if (cantidad>=4) {
            Reducir = (cantidad-(cantidad%4))/4;
            cantidadACobrar=cantidad-Reducir;
        } else { cantidadACobrar=cantidad; }

        int importe = cantidadACobrar * costo;

        if (importe>300) { dscto = 0.10F; }
        else { dscto = 0.0F; }

        float importeFinal = importe + (importe * dscto);
        //Printing
        System.out.println("Codigo de barras: "+Cbarra);
        System.out.println("Cantidad de articulos: "+cantidad);
        System.out.println("Cantidad a pagar: "+ cantidadACobrar);
        System.out.println("Costo del articulo: "+costo);
        System.out.println("Total a pagar: "+importeFinal);
    }

}
