package ru.sayakhov.GameNumbers;
import java.net.PasswordAuthentication;
import java.util.Random;
import java.util.Scanner;



public class Game {
	public static void main(String[] args) {

		System.out.println("Wellcome to game");
		System.out.println("Rulls are easy, try to guess -  what nummber i thinking of?");
		System.out.println();

		System.out.println("We have 3 levels. \n1-st Easy (from 1 - to 100). \n2-nd Normal (from -100 - to 100).  \n3-d Hard (from -1000 - to 1000)");
		System.out.println();

		// можно добавить попытку на то чтоб угадать число
		// реализовать фичу тепло холодно
		Game.chooseLevel(); //запуск метода
	} //привествие и запуск

	public static int chooseLevel() {
		System.out.println("Please  chouse your skill power and type integer: 1 \"Easy\", 2 \"Normal\" or 3 \"Hard\"");
		int level = Game.checkLevel();
		if (level == 1) {
			int myNumber = PCrandom(1); // загадываем число
			HotCold(myNumber); // передаем загаданное число
		} else if (level == 2) {
			int myNumber = PCrandom(2);
			HotCold(myNumber); // передаем загаданное число
		} else if (level == 3) {
			int myNumber = PCrandom(3);
			HotCold(myNumber); // передаем загаданное число
		} else {
			System.out.println("Please type only one integer number, in range 1 - 3, restart game please");
		}
		return level;
	} // выбор уровня


	public static int checkLevel() {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			return scanner.nextInt();
		} else {
			System.out.println("Please type only one integer number");
		}
		return chooseLevel();
	} // метод фильтра строка число

	private static int PCrandom(int a) {
		if (a == 1) {
			Random r = new Random();
			int Low = 1;
			int High = 100;
			int Result = r.nextInt(High - Low) + Low;
			System.out.println(Result+"You are playing Easy level (from 1 - to 100)");
			return Result;
		} else if (a == 2) {
			Random r = new Random();
			int Low = -100;
			int High = 100;
			int Result = r.nextInt(High - Low) + Low;
			System.out.println(Result+"You are playing Normal level (from -100 - to 100)");
			return Result;
		} else {
			Random r = new Random();
			int Low = -1000;
			int High = 1000;
			int Result = r.nextInt(High - Low) + Low;
			System.out.println(Result+"You are playing Hard level (from -1000 - to 1000)");
			return Result;
		}
	}   //загадываю число

	private static void HotCold(int enigma) {
		int answer = 0;
		while (answer != enigma) {
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				answer = scanner.nextInt();
				if (answer == enigma) {
					System.out.println("You win, great job!");
					answer = enigma;
				} else {
					System.out.println("Wrong answer, try again");
					if (answer < enigma){
						System.out.println("Try the higher number");
						System.out.println();

					}else if (answer > enigma){
						System.out.println("Try the below number");
						System.out.println();
					}
				}
			} else {
				System.out.println("Please type only integer numbers");
			}
		}
	}
}