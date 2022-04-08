package patterns;

import java.util.Scanner;

public class triangle_of_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, k = 1,l = n;
        while(i<=n){
            int spaces = 1;
            while(spaces<l){
                System.out.print("  ");
                spaces++;
            }
            int j = i;
            while(j<=k){
                System.out.print(j+" ");
                j++;
            }
            j-=2;
            while(j>=i){
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            k+=2;
            i++;
            l--;
        }
    }
}
