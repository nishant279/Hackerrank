import java.util.*;

public class SavThPriosner {

	public static void main(String[] args) {
		int res = 0;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int h = m%n;
			if(h == 0){
				h = n;
			}
			if((s-1) + h > n){
				res = (s-1) - (n-h);
			}
			else{
				res = (s-1) + h;
			}
			System.out.println(res);
			t--;
		}
	}

}
