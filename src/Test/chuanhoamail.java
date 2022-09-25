import java.util.*;

public class chuanhoamail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> res = new TreeSet<>();
        while(sc.hasNextLine()){
            res.add(sc.nextLine().toLowerCase().trim());
        }
        for(String x :res ){
            System.out.print(x);
        }
    }
}
