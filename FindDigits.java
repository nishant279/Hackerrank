import java.util.*;

public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int cnt = 0, count = 0;
			int n = sc.nextInt();
			int x = n;
			while(x > 0){
				x = x/10;
				cnt = cnt + 1;
			}
			int b[] = new int [cnt];
			int temp = n;
			for(int i = 0;i < cnt;){
				b[i] = temp%10;
				if(b[i] == 0){
					i++;
				}
				else if(n%b[i] == 0){
					count++;
					i++;
				}
				temp = temp/10;
			}
			System.out.println(count);
			t--;
			count = 0;
		}
	}
}