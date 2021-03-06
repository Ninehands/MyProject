package Lesson4;

import java.util.Random;
import java.util.Scanner;
public class Lesson4 {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkHV(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (checkDiag(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkDiag(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (checkHV(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    /*   public static boolean checkWin(char symb) {
       if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return
               true;
       if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return
                true;
       if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return
                true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return
                true;
      if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return
               true;
       if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return
                true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return
                true;
        return false;
 \*/
//------------------------проверка циклом--------------------------------------------
    public static boolean checkDiag(char symb) {
        boolean r, l;
        r = true;
        l = true;
        for (int i=0; i<3; i++) {
            r &= (map[i][i] == symb);
            l &= (map[3-i-1][i] == symb);
        }

        if (r || l) return true;

        return false;
    }
   public static boolean checkHV(char symb) {
        boolean cols, rows;
        for (int col=0; col<3; col++) {
            cols = true;
            rows = true;
            for (int row=0; row<3; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }

            if (cols || rows) return true;
        }
        return false;
    }


//-------------------------------конец проверки циклом. проверка ничьи---------------
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
// ------------------------------ход компа ----------------------
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                1));
        map[y][x] = DOT_O;
    }
    //-------------------ход человека-------------------
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    //--------------------------проверка свободности ячейки------------
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    //---------заполнение поля пустыми ячейками-------
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //---------печатаем поле--------------------
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
