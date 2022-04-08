package patterns;

import java.util.Scanner;

public class p4321 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int i = 1;
        int i = 0;
        int num = 1;
        while(i<n){ // while(i<=n){
//            int j = i;
//            while (j >= 1){
//                System.out.print(j);
//                j--;
//            }
            int j = 0;
            while (j<=i){
                System.out.print(num + i - j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
