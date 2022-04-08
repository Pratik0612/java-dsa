package com.company;
import java.util.*;
public class sum_of_even_nos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        int sum=1;
        for(int i = 0;i<=N;i+=2){
            sum += i;
        }
        if(N%2!=0){
            sum += N;
        }
        System.out.println(sum);
    }
}
