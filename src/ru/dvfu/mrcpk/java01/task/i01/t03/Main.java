package ru.dvfu.mrcpk.java01.task.i01.t03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int x = sc.nextInt();
        int y = x / 2;
        int z = y * 2 + 2;
        System.out.println("Следующее четное число: "+ z);
    }
}
