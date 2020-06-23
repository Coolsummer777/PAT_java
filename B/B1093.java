import java.util.*;
public class B1093{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int[] hash = new int[127];
        int sum = 0;
        for(int i=0;i<s1.length();i++)
            hash[(int)s1.charAt(i)]=1;
        for(int i=0;i<s2.length();i++)
            hash[(int)s2.charAt(i)]=1;
        for(int i=0;i<127;i++)
            if(hash[i]>0)
                sum+=i;
        System.out.printf("%d\n", sum);
    }
}