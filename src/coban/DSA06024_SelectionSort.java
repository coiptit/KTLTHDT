package coban;

import java.util.Scanner;

public class DSA06024_SelectionSort {
    static void sort(int arr[], int n) {
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            dem++;
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }if (i != min_idx) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }

            System.out.print("Buoc " + dem + ": ");
            printArray(arr, n);
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr, n);
    }
}
