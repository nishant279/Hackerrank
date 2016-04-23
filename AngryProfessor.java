package AngryProfessor;

import java.util.*;

public class AngryProfessor {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
				if(a[i] <= 0) count++;
			}
			if(count >= k)
				System.out.println("NO");
			else
				System.out.println("YES");
			count = 0;
			t--;
		}

	}

}
