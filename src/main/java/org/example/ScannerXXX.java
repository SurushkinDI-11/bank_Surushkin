package org.example;

import java.util.Scanner;

public class ScannerXXX {
    public static int nextIn() {
        Scanner sc = new Scanner(System.in);
        int x;
        try {
            x = sc.nextInt();
            return x;
        } catch (Exception e) {
            return -1;
        }
    }
}