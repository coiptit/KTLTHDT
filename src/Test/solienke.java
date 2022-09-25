import java.util.*;


public class solienke {


    public static Boolean Check(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            if (Check(Long.toString(n)) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
