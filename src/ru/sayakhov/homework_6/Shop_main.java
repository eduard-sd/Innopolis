package ru.sayakhov.homework_6;

import ru.sayakhov.homework_6.ru.sayakhov.Bread_station;
import ru.sayakhov.homework_6.ru.sayakhov.Meat_station;
import ru.sayakhov.homework_6.ru.sayakhov.Milk_station;
import ru.sayakhov.homework_6.ru.sayakhov.Station;

import java.util.Arrays;

public class Shop_main {
    public static void main(String[] args) {
        Bread_station bread1 = new Bread_station();

        Station[] arrStation = new Station[]{bread1};
        for (int i = 0; i < arrStation.length; i++) {
            System.out.println(arrStation[i].getName());
        }
        // Part of bread station
        bread1.addBread("Ржаной");
        System.out.println(Arrays.toString(bread1.getBread()));
    }
}
