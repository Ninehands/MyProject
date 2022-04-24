package Lesson3;
import java.util.Arrays;

public class Lesson3 {
   public static void main(String[] args) {
    System.out.println("Array1");
    arr1();
    System.out.println("Array2");
    arr2();
    System.out.println("Array3");
    arr3();
    System.out.println("Array4");
    arr4();
    System.out.println("Array5");
    System.out.println(arr5(5, 6));
    System.out.println("*****Array6******");
    arr6();

    }


    public static void arr1(){
       //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
        // и условия заменить 0 на 1, 1 на 0;
       int[] arr1={1, 0, 1, 1, 1, 1, 0, 0, 0};
       for (int i = 0; i < arr1.length; i++){
           if (arr1[i]==0) {
               arr1[i]=1;
           } else {
               arr1[i]=0;
           }
            System.out.print(arr1[i]);
       }
        System.out.println();
   }
   public static void arr2(){
       //2. Задать пустой целочисленный массив длиной 100.
       // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
       int[] arr2= new int[100];
       for (int i=0; i< arr2.length; i++){
           arr2[i]=i+1;
           System.out.print(arr2[i]+" ");
           double x = i/10.00;
           if (x==(int)x){
               System.out.println();
           }
       }
       System.out.println();
   }
   public static void arr3(){
       //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
       // пройти по нему циклом, и числа меньшие 6 умножить на 2;
       int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

       for (int i=0; i<arr3.length; i++){
           if (arr3[i]<6){
               arr3[i]=arr3[i]*2;
           }
           System.out.print(arr3[i]+" ");
       }
       System.out.println();
   }
   public static void arr4(){
       //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
       // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну
       // из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по
       // следующему принципу: индексы таких элементов равны,
       // то есть [0][0], [1][1], [2][2], …, [n][n];
       int [][]table = new int[10][10];
       for (int i =0; i<10; i++){
           for (int j=0; j<10; j++){
               if (i==j){
                   int jj=9-j;
                   int ii=9-i;
                   table[i][j]=1;
                   table[i][jj]=1;
                   table[ii][j]=1;
               }

               System.out.print(table[i][j]+" ");
           }
           System.out.println();
       }
   }
   public static String arr5(int len, int initialValue){
       //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
       // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
       // равна initialValue;
       int[]arr5=new int[len];
       for (int i=0; i<len; i++) {
           arr5[i] = initialValue;

       }
       return Arrays.toString(arr5);

   }
   public static void arr6(){
       //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
       int chkmin=0;
       int chkmax=0;
       int[]arr6=new int[10];
       for (int i=0; i< arr6.length; i++){
       //заполняем массив данными
           arr6[i]=(int)(Math.random() * 10);
       }
       for (int x=0; x<arr6.length; x++){
           if (chkmax<arr6[x]){
               chkmax=arr6[x];
           }
           if (chkmin>arr6[x]){
               chkmin=arr6[x];
           }
       }
       System.out.println(Arrays.toString(arr6));
       System.out.println("Maximum "+chkmax);
       System.out.println("Minimum "+chkmin);


   }


}
