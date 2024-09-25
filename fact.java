package practise;

import java.util.Arrays;

public class fact {
	
	public static void main(String args[]) {
		int arr[] = {10, 12, 13, 9, 6, 11, 5,25};
		int a[][] = new int[arr.length][2];
		for (int i = 0; i < arr.length; i++) {
			a[i][0] = arr[i];
			a[i][1] = factor(arr[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][0] + " " + a[i][1]);
		}
	}
	
	static int factor(int n) {
		if (n < 1) return 0;
		int count = 2;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
				if (i != n / i) 
					count++;
			}
		}
		return count;
	}
}
