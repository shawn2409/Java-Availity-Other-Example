package com.home.prac;

public class Prac {

    public static void main(String[] args) {
        int sum_3 = 0,
                sum_5 = 0;

        for (int x = 1; x <= 100; x++) {
            if ((x * 3) < 100) {
                sum_3 += (x * 3);
            }
            if ((x * 5) < 100) {
                sum_5 += (x * 5);
            }
            System.out.println((x * 3) + " " + (x * 5) + " " + sum_3 + " " + sum_5);
        }
        System.out.println(sum_3);
        System.out.println(sum_5);
        System.out.println(sum_3 + sum_5);
    }
}
