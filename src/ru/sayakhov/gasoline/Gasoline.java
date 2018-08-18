package ru.sayakhov.gasoline;
import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int iGas = scaner.nextInt();
        int priceGas = iGas * 43;
        System.out.println("Gasoline  total price will be: "+priceGas+" Rub");
        System.out.print("for "+iGas+" litres");
    }
}
