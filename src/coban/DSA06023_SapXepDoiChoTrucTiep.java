package coban;

import java.util.Scanner;

public class DSA06023_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        interChangeSort(n,a);
    }

    public static void interChangeSort(int n, int[] a){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int t= a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            System.out.print("Buoc "+(i+1)+": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
