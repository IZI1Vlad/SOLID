//SRP
// Было

import java.util.ArrayList;

public class Auto {
    String name;
    String model;
    int year;
    public Auto (String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String brand) {
        this.name = brand;
    }

    ArrayList <Object> avto = new ArrayList<>();

    public void saveAuto() {
        Auto bmw = new Auto("BMW", "X5", 2020);
        avto.add(bmw);
        System.out.println("Авто сохранено");
    }

    public boolean deleteAuto() {
        avto.remove(0);
        return true;
    }
}

// Стало

class AutoConstructor {

    String name1;
    String model1;
    int year1;

    public AutoConstructor(String name1, String model1, int year1) {
        this.name1 = name1;
        this.model1 = model1;
        this.year1 = year1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public int getYear1() {
        return year1;
    }

    public void setYear1(int year1) {
        this.year1 = year1;
    }

}

class AutoSaver {

    ArrayList <Object> avto1 = new ArrayList<>();

    public void saveAuto() {
        Auto bmw = new Auto("BMW", "X5", 2020);
        avto1.add(bmw);
        System.out.println("Авто сохранено");
    }
}

class AutoDeleter {

    private AutoSaver autoSaver;

    public boolean AutoDeleter() {
        autoSaver = new AutoSaver();
        autoSaver.avto1.remove(0);
        return true;
    }

}

