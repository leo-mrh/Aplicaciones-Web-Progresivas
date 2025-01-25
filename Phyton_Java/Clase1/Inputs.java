package edu.utvt.clase1;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        String name;
        int age;
        String message = "querollo %s, tu edad es %d";
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa tu nombre: ");
        name = sc.nextLine();

        System.out.print("ingresa tu edad: ");
        age = sc.nextInt();

        sc.close();
        String finalMessage = String.format(message, name, age);
        System.out.println(finalMessage);
    }
}
