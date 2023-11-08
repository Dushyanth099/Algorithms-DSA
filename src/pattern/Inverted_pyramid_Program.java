package pattern;

import java.util.Scanner;

public class Inverted_pyramid_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
for(int i=1;i<=n;i++) {
	for(int Space=1;Space<i;Space++)
		System.out.print(" ");
	for(int j=n;j>=i;j--) {
		System.out.print("* ");
}
System.out.println();

	}
	}
}
