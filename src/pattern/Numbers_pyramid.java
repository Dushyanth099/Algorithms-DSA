package pattern;

import java.util.Scanner;

public class Numbers_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int Space=n;Space<i;Space++)
				System.out.print(" ");
		for(int j=1;j<=i;j++) { 

			System.out.print(j);
		}
			System.out.println();
		}
		s.close();
}}
