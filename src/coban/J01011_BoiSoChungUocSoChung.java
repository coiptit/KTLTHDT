package coban;

import java.util.Scanner;

public class J01011_BoiSoChungUocSoChung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            euclid(a,b);
            t--;
        }
    }

    public static long ucln(long a,long b) {
        if (b==0) return a;
        return ucln(b,a%b);
    }

    public static void euclid(long a,long b){
        System.out.println((a*b)/ucln(a,b)+" "+ ucln(a,b));
    }
}
