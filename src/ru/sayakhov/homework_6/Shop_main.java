package ru.sayakhov.homework_6;

import ru.sayakhov.homework_6.ru.sayakhov.Bread_station;
import ru.sayakhov.homework_6.ru.sayakhov.Meat_station;
import ru.sayakhov.homework_6.ru.sayakhov.Milk_station;
import ru.sayakhov.homework_6.ru.sayakhov.Station;

import java.util.Arrays;

public class Shop_main {
    public static void main(String[] args) {
        Bread_station bread1 = new Bread_station();
        Milk_station milk1 = new Milk_station();
        Meat_station meet1 = new Meat_station();

        Station[] arrStation = new Station[]{bread1,milk1,meet1};
        for (int i = 0; i < arrStation.length; i++) {
            System.out.println(arrStation[i].getName());
        }
        // Part of bread station
        System.out.println();
        bread1.addBread("Ржаной");
        bread1.addBread("Батон нарезной");
        System.out.println(Arrays.toString(bread1.getBread()));
        System.out.println(bread1.getBreadById(1));

        // Part of milk station
        System.out.println();
        milk1.addMilk("Топленное молоко");
        System.out.println(Arrays.toString(milk1.getMilk()));
        System.out.println(milk1.getMilkById(5));
        // Part of meet station
        System.out.println();
        meet1.addMeet("Баранина");
        System.out.println(Arrays.toString(meet1.getMeet()));
        System.out.println(meet1.getMeetById(6));

    }
}
