import java.util.*;
public class B1005{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] check = new int[n];
        int[] hash = new int[101];
        int temp = 0;
        for(int i=0;i<n;i++){
            check[i] = in.nextInt();
            hash[check[i]] = 1;
        }
        in.close();
        for(int i=0;i<n;i++){
            if (hash[check[i]]==0)
                continue;
            else{
                temp = check[i];
                while(temp>1){
                    if((temp%2)==0)
                        temp/=2;
                    else 
                        temp=(3*temp+1)/2;
                    if(temp<101)
                        hash[temp]=0;
                }
            }
        }
        for(int i=0;i<101;i++)
            if(hash[i]==1){
                temp=i;
                break;
            }
        for(int i=100;i>temp;i--)
            if(hash[i]==1)
                System.out.printf("%d ",i);
        System.out.printf("%d\n",temp);
    }
}