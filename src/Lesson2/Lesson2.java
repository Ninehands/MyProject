package Lesson2;

public class Lesson2 {
   public static void main(String[] args) {
       System.out.println(summ(20, 4));
       System.out.println(checkint(-5));
       System.out.println(checkInt2(-5));
       PrintString("love", 5);

    }
    public static boolean summ(int a, int b) {
       int c;
       c=a+b;
       if (c>=10&&c<=20) {
           return true;
       } else {
           return  false;
       }
    }
    public static String checkint(int d) {
       if (d>=0) {
           return "Positive";
       } else {
           return "Negative";
       }
    }
    public static boolean checkInt2(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void PrintString(String str, int e) {
              for (int i = 0; i<e; i++) {
           System.out.println(str);
       }

    }
}
