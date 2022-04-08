package com.company;

import java.util.Scanner;

public class fibonacci_nos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nexTerm=0;
        int a = 0,b = 1;

        for(int i=1;i<=N;i++){
            if(i == 1){
                System.out.print(a+" ");
                continue;
            }
            if(i == 2){
                System.out.print(b+" ");
                continue;
            }
            nexTerm = a+b;
            System.out.print(nexTerm + " ");
            a = b;
            b = nexTerm;
        }
    }
}
