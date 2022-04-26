package Lesson6;

public class Horse extends Animals{

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }
    public void swim(){
        System.out.println("Конь плывет");
    }
}
