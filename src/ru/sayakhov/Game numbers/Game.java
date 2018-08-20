package ru.sayakhov.Game/ numbers;
import java.util.Scanner;
import java.io.math

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wellcome to game");
		System.out.println("Rulls are easy, try to guess -  what nummber i thinking of?");
		System.out.println();
		
		System.out.println("We have 3 levels. /n 1st Hard (from 1 - to 100). /n 2-nd (from -100 to 100).  /n 3-d (from -1000 - to 1000) ");
		System.out.println();
		System.out.println("Please  chouse your skill power and type : 1, 2 or 3);
		// можно добавить попытку на то чтоб угадать число
		// реализовать фичу тепло холодно
		
		String line = scanner.newLine();
		public static selectLevel(){
			if (scanner.hasNextInt){
				int level = scanner.nextInt();
				if (level = 1){
					запуск функции рандом
					запукс цикла while 
				}if (level = 2){
					запуск функции рандом
				}if (level = 3){
					запуск функции рандом
				}else{
					System.out.println("Something happends wrong, restart game please");
				
			}else{
				System.out.println("Please type only one integer number in range from 1 to 3");
				selectLevel()
			}
		}
        
		public static random(){
			int rand = ThreadLocalRandom.current().nextInt(x,y);
		}
		
		
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
