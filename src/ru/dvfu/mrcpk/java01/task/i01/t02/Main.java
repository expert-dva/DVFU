package ru.dvfu.mrcpk.java01.task.i01.t02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите двухзначное число:");
        int x = sc.nextInt();
        int y = x / 10;
        System.out.println("Количество десятков: "+ y);
    }
}