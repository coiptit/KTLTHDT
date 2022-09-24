package coban;

import java.util.Scanner;

public class DSA06025_SapXepChen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        insertionSort(n,a);
    }

    public static void insertionSort(int n, int[] a){
        System.out.println("Buoc "+(0)+": "+ a[0]);
        for (int i = 1; i < n; i++)
        {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
            System.out.print("Buoc "+(i)+": ");
            for (int k = 0; k < i+1; k++) {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
