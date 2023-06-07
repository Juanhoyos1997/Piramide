package com.example.torredehanoi;
import java.util.Scanner;
public class main {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        TorreHanoi  hanoi = new TorreHanoi();

        System.out.println( " INGRESE NUMERO DE DISCOS: ");

        int numeroDiscos= scanner.nextInt();

        hanoi.iniciar(numeroDiscos, 1, 2, 3);

        System.out.println( " \n Cantidad De Movimientos: " + hanoi.contadorMovimiento);
    }
}


