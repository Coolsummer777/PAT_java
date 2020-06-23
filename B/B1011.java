import java.util.*;
public class B1011{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a = 0;
        long b = 0;
        long c = 0;
        for (int i=1;i<=n;i++){
            System.out.printf("Case #%d: ",i);
            a = in.nextLong();
            b = in.nextLong();
            c = in.nextLong();
            if (a+b>c)
                System.out.println("true");
            else 
                System.out.println("false");
        }
        in.close();
    }
}