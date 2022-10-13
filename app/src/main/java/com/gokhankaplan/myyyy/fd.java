package com.gokhankaplan.myyyy;

import java.util.Scanner;

public class fd {

    public static void metot(int b) {

        System.out.print(b + " ");

        if (0 < b) {
            metot(b - 5);
            System.out.print(b + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen bir sayı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Sonuç: ");
        metot(a);
    }
}
