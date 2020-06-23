import java.util.*;
public class B1010{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m = 0;
        n = in.nextInt();
        m = in.nextInt();
        if(m>0)
            System.out.printf("%d %d",n*m,m-1);
        else
            System.out.print("0 0");
        while (in.hasNextInt()){
            n = in.nextInt();
            m = in.nextInt();
            if(m>0)
                System.out.printf(" %d %d",n*m,m-1);
        }
        in.close();
        System.out.println("");
    }
}