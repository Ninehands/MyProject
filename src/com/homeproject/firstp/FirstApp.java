package com.homeproject.firstp;

//import static java.lang.System.in;

public class FirstApp {
    //new
    public static void main(String[] args){
        System.out.println("------------Часть 1------------");
        printThreeWords();
        System.out.println("------------Часть 2------------");
        checkSumSign();
        System.out.println("------------Часть 3------------");
        printColor();
        System.out.println("------------Часть 4------------");
        compareNumbers();

        }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        //much more interesting
        int a = -10 + (int)(Math.random() * 10);
        int b = 6, c;
        c = a + b;
        if (c >= 0) {
            System.out.println("Positive " + c);
        }
        else {
            System.out.println("Negative " + c);
        }
    }
    public static void printColor(){
        int value=-200+(int) (Math.random()*300);
        if (value<=0) {
            System.out.println(value+" Красный");
        }
        if (value>0 && value<100){
            System.out.println(value+" Желтый");
        }
        if (value>100){
            System.out.println(value+" Зеленый");
        }
    }
    public static void compareNumbers(){
        int a=(int)(Math.random()*10), b=(int) (Math.random()*10);
        if (a>=b){
            System.out.println(a+">="+b);
        }else{
            System.out.println(a+"<"+b);
        }
    }
}
