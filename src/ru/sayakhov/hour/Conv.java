package ru.sayakhov.hour;
import java.util.Scanner;

public class Conv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long iseconds = scanner.nextInt();
        long Hour = iseconds / 3600;
        System.out.println("Hours: "+Hour);
    }
}
