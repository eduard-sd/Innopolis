package ru.sayakhov.lesson4_loops.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Taskone {

    public static void main(String[] args) {
        int i = 0;
        int[] intArray = new int[5];
        while(i<5){
            System.out.print("Введите число ");
            System.out.println(1+i);
            Scanner scanner = new Scanner(System.in);
            while(!scanner.hasNextInt()){ //проверка не равно числу
                System.out.println("Пожалуйста введите только целые числа, без букв и знаков препинания.");
                scanner.next();
            }
            int number = scanner.nextInt();
            intArray[i++] = number;
        }

        Arrays.sort(intArray);
        System.out.println("Minimum = " + intArray[0]);
        System.out.println("Maximum = " + intArray[intArray.length-1]);

    }
}
