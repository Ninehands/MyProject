package Lesson6;

public class Cat extends Animals{

    public Cat(String name, String color, int age) {
        super(name, color, age);

    }
    public void voice(){
        System.out.println("Мяу");
    }


    public void run(){
        if (getRunSpeed()<200){
            System.out.println("Кот "+getName()+" пробежал "+getRunSpeed());
        }else{
            System.out.println("Кот "+getName()+" пробежал 200 метров и устал");
        }
    }
    public void sweem(){
        System.out.println("Коты не умеют плавать");
    }

}
