import java.io.*;
import java.util.*;

public class EndofFile {

    public static void main(String args[]) {
        int n=1;
        Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                if(sc.hasNext() == true){
                    System.out.println(n+" "+sc.nextLine());
                    n++;
                }
            }
    }
}