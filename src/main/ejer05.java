package main;

import java.util.Scanner;

public class ejer05 {
    public static void main(String[] args) {
        int phora,horas, exceso, excesoexcesivo,pago;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese su salario por hora");
        phora = t.nextInt();
        System.out.println("Ingrese la cantidad de horas");
        horas = t.nextInt();



        if(horas>40){
            exceso=horas-40;
            if(exceso>8){
                excesoexcesivo=exceso-8;
                pago = (excesoexcesivo*phora*3)+(exceso*phora*2)+(40*phora);
            } else {
                pago = (exceso*phora*2)+(40*phora);
            }
        } else {
            pago = horas * phora;
        }
        System.out.println("El pago es de: "+pago);
    }
}
