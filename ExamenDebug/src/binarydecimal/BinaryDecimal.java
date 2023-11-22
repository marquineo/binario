/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarydecimal;

// Java Program to convert from decimal to binario
//Programa Java para pasar de decimal a binario
//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)
//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)
/**
 *
 * @author
 */
import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Introduzca un número que sea mayor que 0");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.print("Binario: ");
        decBin(n);
    }

    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n <= 2) {
            System.out.print(n);
        } else {
            do{
            decBin(n % 2);
            System.out.print(n);
        }while(n % 2 > 1);
            }
    }
}
