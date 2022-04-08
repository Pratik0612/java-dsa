package patterns;

import java.util.Scanner;

public class intersecting_alphabets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        for(int i = 0; i<n; i++){
            char c = (char)('A'+n-1);
            for(j = 0; j<=i; j++) {
                System.out.print((char) (c + j - i));
            }
            System.out.println();
        }
    }
}
