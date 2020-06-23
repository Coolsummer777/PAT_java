import java.util.*;
public class B1008{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = in.nextInt();
        in.close();
        m = m%n;
        if (m==0){
            for(int i=0;i<n-1;i++)
                System.out.printf("%d ",num[i]);
            System.out.printf("%d\n",num[n-1]);
        }
        else{
            for(int i=n-m;i<n;i++)
                System.out.printf("%d ",num[i]);
            for(int i=0;i<n-m-1;i++)
                System.out.printf("%d ",num[i]);
            System.out.printf("%d\n",num[n-m-1]);
        }
    }
}