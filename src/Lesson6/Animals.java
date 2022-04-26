package Lesson6;

public class Animals {
    private String name;
    private String color;
    private int age;
    private int swimSpeed;
    private int runSpeed;

    public Animals(String name, String color, int age){
        this.age = age;
        this.name=name;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }
// info
    public String toString(){
        return "Name is "+name+" age is "+age+" Color is "+color;
    }
    public void voice(){
        System.out.println("Животное издает звук");
    }
}
