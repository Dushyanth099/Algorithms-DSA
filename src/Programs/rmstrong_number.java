package Programs;

import java.util.Scanner;

public class rmstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,sum=0,r,temp = 0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter The Number = ");
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
			}
		if(temp == sum)
			System.out.println("Amstrong number");
		else
			System.out.println("Not a Amstrong number");
		s.close();
			
		}
}