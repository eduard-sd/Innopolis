package ru.sayakhov.salary;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	long iSalary = scanner.nextLong();
		double CleanSalary = iSalary * 0.87;
		double NDFL = iSalary - CleanSalary;
		System.out.println("Clean salary: "+CleanSalary+" Rub");
		System.out.println("NDFL: "+NDFL);
    }
}
