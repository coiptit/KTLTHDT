import java.util.Scanner;

public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String str = sc.nextLine();
            str.trim();
            String arr [] = str.split(" ");
            for(int i=0;i<arr.length;i++){
                StringBuilder x = new StringBuilder(arr[i]);
                arr[i] = x.reverse().toString();
            }
            for(String x :arr){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
