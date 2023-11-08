package Programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,fact=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number= ");
n=s.nextInt();
for(int i=0;i<n;i++) {
fact+=i;
System.out.println("Factorail = "+fact);
}
s.close();
}
	}


