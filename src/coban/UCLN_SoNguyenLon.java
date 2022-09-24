package coban;

import java.math.BigInteger;
import java.util.Scanner;

public class UCLN_SoNguyenLon {
    static BigInteger ucln(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(ucln(a,b));
        }
    }
}
