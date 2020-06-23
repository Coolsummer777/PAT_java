import java.util.*;
public class B1004{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] name = new String[n];
        String[] id = new String[n];
        int[] score = new int[n];
        int max = -1;
        int min =101;
        int maxnum = 0;
        int minnum = 0;
        for(int i=0;i<n;i++){
            name[i] = in.next();
            id[i] = in.next();
            score[i] = in.nextInt();
            if(score[i]>max){
                max = score[i];
                maxnum = i;
            }
            if(score[i]<min){
                min = score[i];
                minnum = i;
            }
        }
        in.close();
        System.out.println(name[maxnum]+" "+id[maxnum]);
        System.out.println(name[minnum]+" "+id[minnum]);
    }
}