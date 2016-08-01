import java.util.*;

public class MaxXor {
	
	private static int MaximizeXor(int l, int r){
		int ans = 0;
		int i, j, m;
		for(i = l; i < r; i++){
			for(j = i+1; j <= r;j++){
				m = i^j;
				if(ans < m)
					ans = m;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int res;
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		res = MaximizeXor(L, R);
		System.out.println(res);

	}

}
