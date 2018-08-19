package ru.sayakhov.hour;
import java.util.Scanner;

public class Conv {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine(); // отлавливаем строку
        char c = line.charAt(0); // создаем переменную С для 1-го символа

        if (Character.isDigit(c)) { // проверяем переменную - число ли
            Long seconds = Long.valueOf(line);
            long Hour = seconds / 3600;
            System.out.println("Hours: " + Hour);
        } else{
            System.out.println("It`s not number");
        }
    }
}
