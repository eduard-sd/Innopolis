package ru.sayakhov.homework_6.ru.sayakhov;

public class Milk_station extends Station{
    public Milk_station() {
        super("Молочный отдел");
    }
    public void stationInfo(){
        System.out.println("Молочный отдел");
    }
    private double count_production = 0;
    private String[] milk = new String[] {"Молоко", "Сыр", "Творог"};
}
