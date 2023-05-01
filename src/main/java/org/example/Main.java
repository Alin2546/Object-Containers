package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = cin.nextInt();
            System.out.print(x[i] + " ");

        }


    }
}
