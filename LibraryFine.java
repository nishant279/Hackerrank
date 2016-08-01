import java.util.*;
public class LibraryFine {

	public static void main(String[] args) {
		int fine;
		Scanner sc = new Scanner(System.in);
		int ad = sc.nextInt(); 
		int am = sc.nextInt();
		int ay = sc.nextInt();
		int ed = sc.nextInt();
		int em = sc.nextInt();
		int ey = sc.nextInt();
		if(ay == ey){
			if(am == em){
				if(ad == am){
					fine = 0;
					System.out.println(fine);
				}
				else if(ad > am){
					fine = 15*(ad-ed);
					System.out.println(fine);
				}
			}
			else if(am > em){
					fine = 500*(am-em);
					System.out.println(fine);
			}
		}
		else if(ay > ey){
			fine = 10000;
			System.out.println(fine);
		}
	}
}
