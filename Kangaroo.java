import java.util.*;

public class Kangaroo {

	public static void main(String[] args) {
		int res1 = 0, res2 = 0;
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		if(x2 > x1 && v2 >= v1){
			System.out.println("NO");
		}
		else if((x1 - x2) % (v2 - v1) == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
