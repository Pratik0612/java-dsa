package patterns;

import java.util.Scanner;

public class char_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            char c = (char)('A'+i);
            for(int j = 0;j<n;j++){
//                char c = (char)('A'+i+j);
                System.out.print((char)(c+j));
            }
//            for(int j = 0;j<=i;j++){
////                char c = (char)('A'+i+j);
//                System.out.print((char)(c+j));
//            }
            System.out.println();
        }

    }
}
