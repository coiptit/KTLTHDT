package coban;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet_SoNguyenLon {
    static boolean chiaHet(BigInteger a, BigInteger b) {
        if(a.divide(b).multiply(b).equals(a) || b.divide(a).multiply(a).equals(b)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            if (chiaHet(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
