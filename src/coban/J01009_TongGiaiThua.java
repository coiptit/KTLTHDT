package coban;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        tongGiaiThua(n);
    }

    public static long giaiThua(int n){
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }
    public static void tongGiaiThua(int n) {
        long tongGiaiThua=0;
        for (int i=1;i<=n;i++){
            tongGiaiThua+=giaiThua(i);
        }
        System.out.println(tongGiaiThua);
    }
}
