import java.util.*;

public class DivSumPairs {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int [n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i < j)
					if((a[i] + a[j]) % k == 0){
						count++;
					}
			}
		}
		System.out.println(count);
	}
	
}