package ru.geekbrains.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        int x1 = 5;
        int x2 = 10;
        int a = 15;
        int c = -4;
        String s = "JAVA";
        int counter = 5;
        boolean result = within10and20(x1, x2);
        System.out.println(result);
        isPositiveOrNegative(a);
        boolean value = isNegativ(c);
        System.out.println(value);
        printWordinTime(s, counter);
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");


        } else {
            System.out.println("Число отрицательное");

        }
    }

    public static boolean isNegativ(int c) {
        if (c >= 0) {
            return false;
        } else {
            return true;
        }

    }
    public static void printWordinTime (String s, int counter) {
        for (int i = 0; i <= counter; i ++) {
            System.out.println(s);
        }
    }
    
}