package ru.sayakhov.homework_6.ru.sayakhov;

public class Milk_station extends Station{
    private String[] milk = new String[] {"Молоко", "Сыр", "Творог"};

    public Milk_station() {
        super("Молочный отдел");
    }
    public String getMilkById (int n){
        if(n<milk.length){
            return milk[n];
        }else{
            return "Такого молочного продукта нет";
        }
    }

    public void addMilk(String n){
        String[] milkNew = new String[milk.length+1];
        for (int i = 0; i <milk.length ; i++) {
            milkNew[i] = milk[i];
        }
        milkNew[milk.length] = n;
        milk = milkNew;
    }
    public String[] getMilk(){return milk;}
}
