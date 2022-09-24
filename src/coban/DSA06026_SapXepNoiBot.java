package coban;

import java.util.Scanner;

public class DSA06026_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        bubbleSort(n,a);
    }

    public static void bubbleSort(int n, int[] a){
        boolean checkSw;
        for (int i = 0; i < n-1; i++){
            checkSw=false;
            for (int j = 0; j < n-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    checkSw=true;
                }
            }
            if (!checkSw) break;
            System.out.print("Buoc "+(i+1)+": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
