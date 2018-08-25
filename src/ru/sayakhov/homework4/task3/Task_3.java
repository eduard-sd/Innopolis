package ru.sayakhov.homework4.task3;

public class Task_3{
    public static void main(String[] args) {
        //Написать программу для вывода на экран таблицы умножения
        for (int j = 1; j <11 ; j++) {
            System.out.println("");
            for (int i = 1; i < 11 ; ++i) {
                System.out.print("  ");
                System.out.print(i*j);
                System.out.print("  ");
            }

        }
    }
}