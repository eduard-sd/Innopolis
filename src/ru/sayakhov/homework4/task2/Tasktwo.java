package ru.sayakhov.homework4.task2;

import java.util.Scanner;

public class Tasktwo {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){ //проверка не равно числу
            System.out.println("Пожалуйста введите любое число");
            scanner.next();
        }
        number = scanner.nextInt();

        if (number>0 && number%2==0){
            System.out.println("Число четное, положительное.");
        }else if(number<0 && number%2==0){
            System.out.println("Число четное, отрицательное.");
        }else if(number>0 && number%2==1||number==1){
            System.out.println("Число не четное, положительное.");
        }else if(number<0 && number%2==-1||number==-1){
            System.out.println("Число не четное, отрицательное.");
        }else{
            System.out.println("Число 0");
        }
    }
/*    Написать 4 программы:
    Написать программу для поиска минимального из двух чисел.
    Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
    Написать программу для вывода на экран таблицы умножения.
    Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.*/

}
