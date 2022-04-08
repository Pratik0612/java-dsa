package com.company;

import java.util.Scanner;

// a number is FIBONACCI if and only if (5*n*n+4) || (5*n*n-4) is a square no.

public class member_of_fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isFib(5*n*n+4) || isFib(5*n*n-4)){
            System.out.println("a Fibonacci number");
            System.exit(0);
        }
        System.out.println("not a Fibonacci number");
    }
    private static boolean isFib(int n){
        int s = (int)Math.sqrt(n);
        return (s*s == n);
    }
}
