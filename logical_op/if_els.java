package logical_op;

import java.util.Scanner;

public class if_els {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a%2==0){
//            System.out.println("even");
//            System.exit(0);
////            return;
//        }
//        System.out.println("odd");


        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(var2 + 1);
    }
}
