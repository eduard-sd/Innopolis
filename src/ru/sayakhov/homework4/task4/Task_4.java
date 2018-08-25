package ru.sayakhov.homework4.task4;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Task_4 {
    public static void main(String[] args) {
        //Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.*/
        int a1 = 0; //a1 - первый член прогрессии :
        int d = 0;  //d - разность прогрессии / q - знаменатьль прогрессии :
        int n = 0; // n - номер члена прогрессии :
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисление арифметической и геометрической прогрессии. Введите два числа. ");
        System.out.print("a1 - первый член прогрессии : ");
        while (!scanner.hasNextInt()) { //проверка не равно числу
            System.out.println("Пожалуйста введите только числа.");
            System.out.print("a1 - первый член прогрессии : ");
            scanner.next();
        }
        a1 = scanner.nextInt();

        System.out.print("d - разность прогрессии / q - знаменатель прогресии : ");
        while (!scanner.hasNextInt()) { //проверка не равно числу
            System.out.println("Пожалуйста введите только числа.");
            System.out.print("d - разность прогрессии / q - знаменатель прогресии : ");
            scanner.next();
        }
        d = scanner.nextInt();

        System.out.print("n - номер члена прогрессии : ");
        while (!scanner.hasNextInt()) { //проверка не равно числу
            System.out.println("Пожалуйста введите только числа.");
            System.out.print("n - номер члена прогрессии : ");
            scanner.next();
        }
        n = scanner.nextInt();

        int math_prog = a1+(d*(n-1));
        System.out.println("math   "+math_prog);

        double pow_q = Math.pow(d,(n-1));
        double geom_prog = a1*(pow_q);
        System.out.println("geom   "+geom_prog);
    }
}
