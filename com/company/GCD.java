package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int GCD = 1;
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(GCD!=0){
            GCD = a%b;
            a = b;
            b = GCD;
        }
//        for(int i=1;i<=b;i++){
//            if(a%i==0 && b%i==0){
//                GCD = i;
//            }
//        }
        System.out.println(a);
//        System.out.println(GCD);

    }
}
