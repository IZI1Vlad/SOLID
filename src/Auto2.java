// OCP
// Было

import java.util.ArrayList;

public class Auto2 {
    String name;
    String model;
    int year;
    public Auto2 (String name, String model, int year) {
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
}
// А теперь нам нужно добавить возможность сохранить Авто в коллецию avto

// Вот как лучше это сделать

// Стало

abstract class AutoAbstract {
   private String name1;
   private String model1;
   private int year1;

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

    public abstract void saveAuto();
}

    class AutoChild extends AutoAbstract {

    ArrayList<Object> avto = new ArrayList<>();

    @Override
    public void saveAuto() {
        Auto bmw = new Auto("BMW", "X5", 2020);
        avto.add(bmw);
        System.out.println("Авто сохранено");
    }
}
