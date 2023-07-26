package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //**********************************************************
        //**********************************************************
        Scanner teclado=new Scanner(System.in);
        //*****************declaro variables************************
        Integer puntaje ;
        String nombreCliente;
        String apellidoCliente;
        String edad;
        String usosTargeta;
        Double montoPesosComprasAseo;
        Double montoPesosComprasAlimentos;
        Double montoPesosOtrosProductos;
        Double totalCompras;
        //**********************Innicializando Variables************
        System.out.print("Ingrese el puntaje de la tarjeta: ");
        puntaje=teclado.nextInt();
        teclado.nextLine();
        System.out.print("Escriba su nombre: ");
        nombreCliente=teclado.nextLine();

        System.out.print("Escriba su Apellido: ");
        apellidoCliente=teclado.nextLine();

        System.out.print("Digite su edad: ");
        edad=teclado.nextLine();

        System.out.print("Escriba la cantidad de usos de la tarjeta en el mes: ");
        usosTargeta=teclado.nextLine();

        System.out.print("Digite el monto de las compras de productos de aseo en $: ");
        montoPesosComprasAseo=teclado.nextDouble();

        System.out.print("Digite el monto de las compras de productos Alimenticios en $: ");
        montoPesosComprasAlimentos=teclado.nextDouble();

        System.out.print("Digite el monto de las compras de otros productos en $: ");
        montoPesosOtrosProductos=teclado.nextDouble();

        //*************************************************************
        //*************(proceso)***************************************
        teclado.nextLine();
        totalCompras=montoPesosComprasAseo+montoPesosComprasAlimentos+montoPesosOtrosProductos;
        System.out.print("El total de tu deuda es:"+totalCompras+" $");
        //***************(parseo)******************************************


        if (puntaje==1) {
        totalCompras=totalCompras-(totalCompras*0.25);
            System.out.println("El total de su deuda con un descuento del 25% es: "+totalCompras);

        } else if (puntaje==2) {
            totalCompras=totalCompras-(totalCompras*0.2);
            System.out.println("El total de su deuda con un descuento del 20% es: "+totalCompras);
        } else if (puntaje==3) {
            totalCompras=totalCompras-(totalCompras*0.15);
            System.out.println("El total de su deuda con un descuento del 15% es: "+totalCompras);
        } else if (puntaje==4) {
            totalCompras=totalCompras-(totalCompras*0.1);
            System.out.println("El total de su deuda con un descuento del 10% es: "+totalCompras);
        }else {
            System.out.println("El total de su deuda es: "+totalCompras+"no tiene ningun descuento");
        }


    }
}