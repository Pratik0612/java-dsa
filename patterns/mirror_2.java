package patterns;

import java.util.Scanner;

public class mirror_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, x = n*3;

        while(i<=n){
            int spaces = 1,val = 1;
            while(spaces<x){
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while(j<=i){
                System.out.print(val);
                val++;
                j++;
            }
            System.out.println();
            x -= 2;
            i++;
        }
    }
}
