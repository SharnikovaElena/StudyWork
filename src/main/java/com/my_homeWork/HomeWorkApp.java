package com.my_homeWork;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println(" Orange\n Banana\n Apple");
    }

    static void checkSumSign() {
        {
            int a = -9;
            int b = 2;
            if ((a + b) >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
    }

    static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100 && value > 0) {
            System.out.println("Желтый");
        }else if (value>100){
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        int a = 0;
        int b = 2;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}