import java.util.*;

public class staticInitializer {
	static boolean flag = false;
	static Scanner sc = new Scanner(System.in);
	static int H = sc.nextInt();
	static int B = sc.nextInt();
	static{
		if(H > 0 && B > 0)
			flag = true;
		else
			System.out.println("java.lang.Exception: breadth and height must be positive");
	}
	public static void main(String[] args) {
		if(flag){
			int area = B * H;
			System.out.print(area);
		}
	}

}
