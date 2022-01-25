package ru.dvfu.mrcpk.java01.task.i01.t05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Найти корень линейного уравнения ax+b=0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a:");
        int a = sc.nextInt();
        System.out.print("Введите число b:");
        int b = sc.nextInt();
        System.out.print("Корнем уравнения будет: "+ findResult(a,b));
    }
    public static String findResult(int a, int b){
        if(a==0 && b==0) return "любое число";
        if(a==0) return "нет корней";
        return String.valueOf(-b/a);
    }
}