package patterns;

import java.util.Scanner;

public class diamond_of_stars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k/2; j++){
                System.out.print("_");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            k--;
            System.out.println();

        }
    }
}
