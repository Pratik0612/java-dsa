package patterns;

import java.util.Scanner;

public class star_patten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1, x=n+4;

        while(i<=n){
            int spaces = 1;
            while(spaces<=x){
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j = 1;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            x--;
            i++;
        }
    }
}
