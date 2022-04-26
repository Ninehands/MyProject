package Lesson6;

public class Main {
    public static void main(String[] args){
        Cat cat =new Cat("Барсик", "рыжий", 36);
        Dog dog1 =new Dog("Кузя", "белый", 33);
        Dog dog2 =new Dog("Зязя", "оранжевый", 45);
        //Horse horse =new Horse("Бульба", "серый", 3);



        System.out.println(cat.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        //System.out.println(horse.toString());
        System.out.println("---------------------БЕГ-------------------");

//-------------------БЕГ--------------------
        cat.setRunSpeed((int)(Math.random() * 400));
        cat.run();

        dog1.setRunSpeed((int)(Math.random() * 1000));
        dog2.setRunSpeed((int)(Math.random() * 1000));
        dog1.run();
        dog2.run();

        System.out.println("---------------------ПЛАВАНИЕ-------------------");


//-------------------ПЛАВАНИЕ--------------------
        dog1.setSwimSpeed((int)(Math.random() * 20));
        dog1.swim();
        dog2.setSwimSpeed((int)(Math.random() * 20));
        dog2.swim();

        cat.sweem();



    }
}
