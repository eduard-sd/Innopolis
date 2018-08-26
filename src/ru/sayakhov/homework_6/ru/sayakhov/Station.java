package ru.sayakhov.homework_6.ru.sayakhov;

// Пример полиморфизма общий метод принт
public class Station {
    public void stationInfo(){}

    public String name;

    public Station(String n){
        name = n;
    }

    public String getName() {
        return name;
    }
}
