package ru.dvfu.mrcpk.java01.task.i01.tXX;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = {"Сколько рогов у единорога?",
                "Кто написал комедию Грибоедова 'Горе от ума'?",
                "Сколько дырок в пятачке у Пятачка?",
                "Вопрос на миллион. Сколько роз подарил художник?"};
        String[][][] answers ={{{"Два","Один","Десять"},{"2"}},
                {{"Пушкин","Достоевский","Грибоедов","Путин"},{"3"}},
                {{"Ни одной","Одна","Две"},{"3"}},
                {{"Миллион","Миллиард","Одну","Ни одной"},{"1"}}};
        for (int i = 0; i<questions.length; i++){
            System.out.println(questions[i]);
            for (int j = 0; j<answers[i][0].length; j++){
                System.out.println((j+1)+". "+answers[i][0][j]);
            }
            String answer = answers[i][1][0];
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите номер ответа:");
            String a = sc.next();
            if (a.equals(answer)) {System.out.println("Ответ верный");}
            else {System.out.println("Ответ неверный");}
        }
    }
}