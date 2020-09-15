// LSP
// Было

public class Auto3 {
    String name;
    int year;
 public void AutoName() {
     System.out.println(name);
 }
}

 class Auto4 extends Auto3 {
    @Override
    public void AutoName() {
        System.out.println(year);
    }
}

// Так делать нельзя.В классе потомке нельзя изменять ожидаемое поведение переопределённых методов

// Стало

class Auto5 {
    String name;
    int year;
    public void AutoName() {
        System.out.println(name);
    }
}

class Auto6 extends Auto5 {
    @Override
    public void AutoName() {
        System.out.println(name);
    }
}