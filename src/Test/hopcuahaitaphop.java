import java.util.Scanner;
import java.util.TreeSet;

public class hopcuahaitaphop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        TreeSet<Integer> d = new TreeSet<>();

        for(int i=0;i<n;i++) a.add(sc.nextInt());
        for(int i=0;i<m;i++) b.add(sc.nextInt());
        c=(TreeSet<Integer>) a.clone();
        d=(TreeSet<Integer>) b.clone();

        c.retainAll(d);
        a.removeAll(c);
        b.addAll(a);
        for(Integer x:b){
            System.out.print(x+" ");
        }
    }



}
