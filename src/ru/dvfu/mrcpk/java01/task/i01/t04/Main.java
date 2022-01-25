package ru.dvfu.mrcpk.java01.task.i01.t04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Среднее арифметическое из 9,45 и 23 равно:" + average(9,45,23));
    }
    public static double average(int a, int b, int c){
        return (double) (a+b+c)/3;
    }
}