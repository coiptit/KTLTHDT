import java.util.Scanner;
import java.util.TreeSet;

public class SNL_QHD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int F[][]= new int[1000][1000];
            String n= sc.nextLine();
            String m = sc.nextLine();
            for (int i=1;i<=n.length();i++){
                for (int j=1;j<=m.length();j++){
                    if(n.charAt(i-1)==m.charAt(j-1)){
                        F[i][j] = F[i-1][j-1]+1;
                    }else{
                        F[i][j] = Math.max(F[i][j-1],F[i-1][j]);
                    }
                }
            }
            System.out.println(F[n.length()][m.length()]);
        }
    }
}
