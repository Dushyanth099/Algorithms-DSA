package Programs;

import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num;
		int product,lastdigit,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		while(num>0)  
		{ 
		lastdigit=num%10;  
		sum=sum+lastdigit;  
		product=product*lastdigit;  
		num=num/10;  
		}
	  
		if(sum==product)  
		System.out.println("The given number is a spy number.");  
		else
			System.out.println("The given number is not a spy number.");
	}
}