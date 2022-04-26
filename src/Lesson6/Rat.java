package Lesson6;

public class Rat extends Animals{

    public Rat(String name, String color, int age) {
        super(name, color, age);
    }
    public void voice(){
        System.out.println("пищит");
    }
}
