import java.util.Scanner;

public class identity_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n+1][n+1];

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==j){
                    a[i][j] = 1;
                }else{
                    a[i][j] = 0;
                }
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(a[i][j]);
            }
            if(i==n){
                break;
            }
            System.out.println();
        }
    }
}
