import java.util.*;
public class B1006{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<(n/100);i++)
            System.out.print("B");
        for(int i=0;i<((n/10)%10);i++)
            System.out.print("S");
        for(int i=1;i<=(n%10);i++)
            System.out.printf("%d",i);
        System.out.println("");
    }
}