package pattern;

import java.util.Scanner;

public class inverted_right_angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("ENter the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j=n;j>=i;j--)
			{
			System.out.print("*");
			
			}
			System.out.println();	
			}
		s.close();
	}
	
	}

	


