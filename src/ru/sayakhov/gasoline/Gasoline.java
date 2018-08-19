package ru.sayakhov.gasoline;
import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input litres: ");
        if (scanner.hasNextLong()) {
            long in = scanner.nextLong();
            long priceGas = in * 43;
            System.out.println("Gasoline  total price will be: " + priceGas + " Rub");
            System.out.print("for " + in + " litres");
        }else{
            System.out.println("It`s not digit");
        }
    }
}
