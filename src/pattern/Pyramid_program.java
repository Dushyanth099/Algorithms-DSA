package pattern;

import java.util.Scanner;

public class Pyramid_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the numbers :");
n=s.nextInt();
for(int i=1;i<=n;i++) {
	for(int Space=n;Space>i;Space--)
		System.out.print(" ");

for(int j=1;j<=i;j++) { 

	System.out.print("* ");
}
	System.out.println();
}
s.close();
}
}
