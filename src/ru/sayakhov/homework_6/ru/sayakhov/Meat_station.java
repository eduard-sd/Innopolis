package ru.sayakhov.homework_6.ru.sayakhov;

public class Meat_station extends Station{
    private String[] meet = new String[] {"Говядина", "Курица", "Свинина"};
    public Meat_station() {
        super("Мясной отдел");
    }

    public String getMeetById(int n){
        if(n<meet.length){
            return meet[n];
        }else{
            return "Такого мяса нет";
        }
    }
    public void addMeet(String n){
        String[] meetNew = new String[meet.length+1];
        for (int i = 0; i <meet.length ; i++) {
            meetNew[i] = meet[i];
        }
        meetNew[meet.length] = n;
        meet = meetNew;
    }
    public String[] getMeet(){
        return meet;
    }
}
