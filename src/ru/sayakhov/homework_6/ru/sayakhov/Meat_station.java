package ru.sayakhov.homework_6.ru.sayakhov;

public class Meat_station extends Station{
    public Meat_station() {
        super("Мясной отдел");
    }

    public void stationInfo() {
        System.out.println("Мясной отдел");
    }
    private double count_production = 0;
    private String[] meet = new String[] {"Говядина", "Курица", "Свинина"};
}
