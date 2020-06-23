import java.util.*;
public class B1009{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        int q=s.length();
        for (int i=s.length()-1;i>=0;i--)
            if(s.charAt(i)==' '){
                System.out.print(s.substring(i+1, q)+" ");
                q=i;
            }
        System.out.println(s.substring(0, q));
    }
}