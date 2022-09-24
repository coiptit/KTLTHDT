package coban;

import java.util.Scanner;

public class DSA06024_SapXepChon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        selectionSort(n,a);
    }

    public static void selectionSort(int n, int[] a){
        int min;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            int t= a[min];
            a[min]=a[i];
            a[i]=t;
            System.out.print("Buoc "+(i+1)+": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
