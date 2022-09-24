package coban;

import java.util.Scanner;

public class J01004_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            soNguyenTo(n);
            t--;
        }
    }

    public static void soNguyenTo(int n) {
        if (checkNguyenTo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkNguyenTo(int n){
        int i;
        if(n<2) return false;
        else{
            for(i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }
}
