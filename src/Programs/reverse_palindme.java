package Programs;

import java.util.Scanner;

public class reverse_palindme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,reverse=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number= ");
		n=s.nextInt();
		int temp=n;
		while(n>0){
		r=n%10;	
		reverse=reverse*10+r;
		n=n/10;
		System.out.println("reverse of n= "+reverse );
		}
	if(temp==reverse) {
	System.out.println("palindrome");
	}
	else 
	{
		System.out.println("not a palindrome");
	}
	s.close();
	}
	}