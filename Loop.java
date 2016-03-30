import java.io.*;
import java.util.*;

public class Loop {

    static void loop(int a, int b, int n){
        int res = 0;
        for(int j=0;j<n;j++){
            res = 0;
            for(int k=0;k<=j;k++){
                    res = res + (int)Math.pow(2, k) * b ;
            }    
                res = res + a;
                System.out.print(res+" ");
            }          
            System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            loop(a,b,n);
        }
    }
}