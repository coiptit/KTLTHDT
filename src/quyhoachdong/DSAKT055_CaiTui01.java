package quyhoachdong;

import java.util.Scanner;

public class DSAKT055_CaiTui01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t>0){
            int N= scanner.nextInt();
            int V= scanner.nextInt();
            int[] A= new int[N];
            int[] C=new int[N];
            for (int i = 0; i < N; i++) {
                A[i]=scanner.nextInt();
            }
            for (int i = 0; i < N; i++) {
                C[i]=scanner.nextInt();
            }
            caiTui01(N,V,A,C);
            t--;
        }
    }

    public static void caiTui01(int N,int V,int[] A,int[] C){
        int[][] F=new int[N+1][V+1];
        for (int i = 0; i <= N; i++) {
            F[i][0]=0;
        }
        for (int j = 0; j <= V; j++) {
            F[0][j]=0;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= V; j++) {
                if (A[i-1]<=j){
                    F[i][j]=Math.max(F[i-1][j],F[i-1][j-A[i-1]]+C[i-1]);
                }
                else {
                    F[i][j]=F[i-1][j];
                }
            }
        }
        System.out.println(F[N][V]);
    }
}
