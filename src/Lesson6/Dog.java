package Lesson6;

public class Dog extends Animals{


    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void voice(){
        System.out.println("гАВ");
    }
    //---------------------БЕГ------------------

    public void run() {
        if (getRunSpeed() < 500) {
            System.out.println("Собака "+getName() + " пробежала " + getRunSpeed());
        } else {
            System.out.println("Собака "+getName() + " пробежала 500 метров и устала");
        }
    }
    //---------------------ПЛАВАНИЕ------------------
    public void swim(){
       if(getSwimSpeed()<10){
            System.out.println("Собака "+getName() +" проплыла "+getSwimSpeed());
        }else {
            System.out.println("Собака "+getName() + " проплыла 10 метров и утонула");
        }
    }

}
