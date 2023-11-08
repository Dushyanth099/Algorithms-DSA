package pattern;

import java.util.Scanner;

public class Diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("ENter the number=");
	for(int i=1;i<=n;i++) {
		for(int Space=1;Space<=n-i;Space++){
			
		System.out.print(" ");
		}
		for (int j=1;j<=i;j++) {
				System.out.print("* ");
		}
	System.out.println();
		}
	for(int i=2;i<=n;i++) {
		for(int Space=1;Space<i;Space++){
			
		System.out.print(" ");
		}
		for (int j=n;j>=i;j--) {
				System.out.print("* ");
		}
	System.out.println();
			
	}

	}
}


