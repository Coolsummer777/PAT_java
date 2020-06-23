import java.util.*;
public class B1007{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int sum = 0;
        int[] prime = new int[n+1];
        for(int i=2;i<=n;i++)
            if(prime[i]==0)
                for(int j=2;j<=(n/i);j++)
                    prime[i*j]=1;
        for(int i=4;i<=n;i++)
            if(prime[i]==0&&prime[i-2]==0){
                sum++;
            }
        System.out.printf("%d\n",sum);
    }
}