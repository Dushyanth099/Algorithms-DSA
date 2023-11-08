package Programs;

import java.util.Scanner;

public class armstrong_number {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.print("Enter The Number = ");
int n=s.nextInt();
int sum=0,r,temp=n;
String str1=String .valueOf(n);
int len=str1.length();
while(n>0)
{
	r=n%10;
	sum=(int) (sum+Math.pow(r, len));
	n=n/10;
	}   
if(temp == sum)
	System.out.println("Amstrong number");
else
	System.out.println("Not a Amstrong number");
s.close();
	
}
}