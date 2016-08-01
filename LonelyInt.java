import java.util.*;

public class LonelyInt {

	private static int lonelyInteger(int[] a, int size){
		int result = 0;
		for(int i = 0;i < size; i++)
			result = result ^ a[i];
		return result;
	}
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a, n));
	}
}
