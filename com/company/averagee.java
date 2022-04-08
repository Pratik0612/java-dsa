package com.company;

import java.util.Scanner;

public class averagee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((double) (a+b+c)/3);
    }
}
