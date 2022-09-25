import java.util.Scanner;

public class caitui01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int F[][] = new int[1000][1000];
            int n = sc.nextInt(),v= sc.nextInt();
            int a [] = new int[n+1];
            int c [] = new int [n+1];
            for(int i=0;i<n;i++){
                a[i] =sc.nextInt();
            }
            for(int i=0;i<n;i++){
                c[i] =sc.nextInt();
            }

            for(int i=0;i<n;i++){
                for (int j=1;j<=v;j++){
                    if(i>0){
                        if(j>=a[i]){
                            F[i][j] = Math.max(F[i-1][j],F[i-1][j-a[i]]+c[i]);
                        }else{
                            F[i][j] = F[i-1][j];
                        }
                    }
                    else if(j>=a[i]){
                        F[i][j]=c[i];
                    }
                }
            }
            System.out.println(F[n-1][v]);
        }
    }
}
