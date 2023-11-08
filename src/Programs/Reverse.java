package Programs;

import java.util.Scanner;

public class Reverse {

public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,r;
Scanner s=new Scanner(System.in);
System.out.print("enter the number= ");
n=s.nextInt();
while(n>0) {
r=n%10;
System.out.print(r);
n=n/10;
s.close();
}
	}
}