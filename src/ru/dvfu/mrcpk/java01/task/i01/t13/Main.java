package ru.dvfu.mrcpk.java01.task.i01.t13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число а:");
        int a = sc.nextInt();
        System.out.print("Введите число b:");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("После перемены число b="+b+" , а число a="+a);
    }
}
