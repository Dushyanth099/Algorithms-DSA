package pattern;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the number=" );
n=s.nextInt();
	for(int i=1;i<=n;i++) {
		for(int space=n;space>i;space--) {
			System.out.print(" ");		
		}
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
	for(int k=i-1;k>=1;k--){
		System.out.print(k);		
	}
	System.out.println();
	}
	
	s.close();
	}

}
