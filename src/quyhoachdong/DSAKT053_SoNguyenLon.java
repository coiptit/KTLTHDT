package quyhoachdong;

import java.util.Scanner;

public class DSAKT053_SoNguyenLon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t>0){
            String N=scanner.nextLine();
            String M=scanner.nextLine();
            soNguyenLon(N,M);
            t--;
        }
    }

    public static void soNguyenLon(String N,String M){
        int a=N.length();
        int b=M.length();
        int[][] L=new int[a+1][b+1];
        for(int i=0; i<=a; i++)
            L[i][0] = 0;
        for(int j=0; j<=b; j++)
            L[0][j] = 0;
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=b; j++){
                if(N.charAt(i-1) == M.charAt(j-1)){
                    L[i][j] = L[i-1][j-1] + 1;
                }
                else{
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        System.out.println(L[a][b]);
    }
}
