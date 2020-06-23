import java.util.*;
public class B1002{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum=0;
        for (int i=0;i<s.length();i++)
            sum+=(int)s.charAt(i)-(int)('0');
        String ss = ""+sum;
        for(int i=0;i<ss.length();i++){
            switch(ss.charAt(i)){
                case '0':
                System.out.print("ling");
                break;
                case '1':
                System.out.print("yi");
                break;
                case '2':
                System.out.print("er");
                break;
                case '3':
                System.out.print("san");
                break;
                case '4':
                System.out.print("si");
                break;
                case '5':
                System.out.print("wu");
                break;
                case '6':
                System.out.print("liu");
                break;
                case '7':
                System.out.print("qi");
                break;
                case '8':
                System.out.print("ba");
                break;
                case '9':
                System.out.print("jiu");
                break;
            }
            if (i<ss.length()-1)
                System.out.print(" ");
        }
        System.out.println("");
    }
}