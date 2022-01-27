package ru.dvfu.mrcpk.java01.task.i02.t01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перемена средних чисел в трехначных числах");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите трехзначное число a:");
        int a = sc.nextInt();
        System.out.print("Введите трехзначное число b:");
        int b = sc.nextInt();
        int aX = a % 10;
        int aXX = a % 100 - aX;
        int aXXX = a - aXX - aX;
        int bX = b % 10;
        int bXX = b % 100 - bX;
        int bXXX = b - bXX - bX;
        System.out.print("Числа после перемены, а:"+ (aXXX+bXX+aX)+" / b:"+(bXXX+aXX+bX));
    }
}
