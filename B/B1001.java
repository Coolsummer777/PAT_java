import java.util.*;
public class B1001{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while (n>1){
            sum++;
            if (n % 2 ==0)
                n/=2;
            else
                n = (3*n+1)/2;
        }
        System.out.printf("%d\n",sum);
    }
}