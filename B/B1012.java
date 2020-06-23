import java.util.*;
public class B1012{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int a1 = 0;
        int sig = -1;
        int a2 = 0;
        double a4 = 0;
        int a5 = 0;
        int temp =0;
        for(int i=0;i<n;i++){
            temp = in.nextInt();
            switch(temp%5){
                case 0:
                    if(temp%2==0){
                        a1+=temp;
                        c1++;
                    }
                    break;
                case 1:
                    c2++;
                    sig*=-1;
                    a2+=sig*temp;
                    break;
                case 2:
                    c3++;
                    break;
                case 3:
                    c4++;
                    a4+=(double)temp;
                    break;
                case 4:
                    c5++;
                    if (temp>a5)
                        a5=temp;
                    break;
            
                
            }
        }
        if(c1>0){System.out.printf("%d ",a1);}
        else {System.out.print("N ");}
        if(c2>0){System.out.printf("%d ",a2);}
        else {System.out.print("N ");}
        if(c3>0){System.out.printf("%d ",c3);}
        else {System.out.print("N ");}
        if(c4>0){System.out.printf("%.1f ",a4/c4);}
        else {System.out.print("N ");}
        if(c5>0){System.out.printf("%d\n",a5);}
        else {System.out.println("N");}
        in.close();
    }
}