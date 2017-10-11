package com.company;

public class Hw1 {
    /*метод 1: результат деления q на w с остатком*/
    private static void task1(){
        int q = 35, w = 6;
        System.out.println("\t" + q + "/" + w +" = " + (int)(q/w) + " и " + (q%w) + " в остатке");
        System.out.println();
    }
    /*метод 2: cумма цифр двузначного числа n*/
    private static void task2(){
        int n = 78;
        int sum = (n/10) + (n%10);
        System.out.println("\tСумма цифр двузначного числа " + n + ": "+ sum);
        System.out.println();
    }
    /*метод 3: ближайшее целое число к числу с плаваюжей точкой*/
    private static void task3(){
        double k, g = 345.987;
        k = g;
        if (g-(int)g>= 0.5) g=(int)g+1;
        else g=(int)g;
        System.out.println("\tБлижайшее целое число к числу " +  k + ": " + (int)g);
        System.out.println();
    }
    /*метод 4: cумма цифр многозначного числа n*/
    private static void task4(){
        int n = 871, sum = 0, m;
        m = n;
        for (int i =0; n > 0; i++){
            sum += (n%10);
            n=n/10;
        }
        System.out.println("\tСумма чисел многозначного числа " + m + ": " + sum);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Задания 1-4:\n");
        task1();
        task2();
        task3();
        task4();
    }
}

