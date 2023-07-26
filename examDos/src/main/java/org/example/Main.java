package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //**********************************************************
        Scanner teclado=new Scanner(System.in);
        //*****************declaro variables************************
        String ccCliente ;
        String nombreCliente;
        String apellidoCliente;
        Integer edad;
        String ciudadCliente;
        Integer numeroBoletas;

        //**********************Innicializando Variables************
        System.out.print("Ingrese su Numero de Cedula: ");
        ccCliente=teclado.nextLine();

        System.out.print("Escriba su nombre: ");
        nombreCliente=teclado.nextLine();

        System.out.print("Escriba su Apellido: ");
        apellidoCliente=teclado.nextLine();

        System.out.print("Digite su edad: ");
        edad=teclado.nextInt();
        teclado.nextLine();
        System.out.print("Escriba la ciudad: ");
        ciudadCliente=teclado.nextLine();

        System.out.print("Ingrese la cantidad de boletas a comprar: ");
        numeroBoletas=teclado.nextInt();
        //********************(proceso)********************************

        if (numeroBoletas<=4&&numeroBoletas>0&&edad>18){
            Integer totalBoleta=numeroBoletas*450000;
            System.out.println("El costo de su compra es: "+totalBoleta+" $");
        }else{
            System.out.println("no se puede realizar la compra tenga en cuenta que deve de ser mayor de edad y no puede comprar mas e 4 boletas");
        }
    }
}