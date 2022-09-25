import java.util.*;


public class thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int x;
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (st.empty())
                st.push(x);
            else {
                if ((st.peek() + x) % 2 == 0)
                    st.pop();
                else
                    st.push(x);
            }
        }
        System.out.print(st.size());
    }
}
