import java.util.*;
public class UtopianTree {

	public static void main(String[] args) {
		int height = 1;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			if(n == 0){
				System.out.println(height);
			}
			height = 1;
			if(n >= 1){
				for(int i = 1;i <= n;i++){
					if(i%2 == 0){
						height = height + 1;
					}
					else{
						height = 2 * height;
					}
				}
				System.out.println(height);
			}
		}
		t--;
		height = 1;
	}

}
