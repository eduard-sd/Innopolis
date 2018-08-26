package ru.sayakhov.homework_6.ru.sayakhov;

public class Bread_station extends Station{
    private String[] bread = new String[] {"Хлеб пшеничный", "Батон", "Лаваш"};

    public Bread_station() {
        super("Хлебный отдел");
    }

    public String getBreadById(int n){
        if (n<bread.length) {
            return bread[n];
        }else{
            return "Хлеба нет";
        }
    }
    public void addBread(String n){
        String[] breadNew = new String[bread.length+1];
        for (int i = 0; i <bread.length ; i++) {
            breadNew[i] = bread[i];
        }
        breadNew[bread.length] = n;
        bread = breadNew;
    }

    public String[] getBread(){
        return bread;
    }
}
