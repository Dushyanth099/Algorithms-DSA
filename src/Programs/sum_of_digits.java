package Programs;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number= ");
		n=s.nextInt();
		while(n>0) {
			r=n%10;
		sum=sum+r;
		n=n/10;
		
		}
		System.out.println("sum= "+sum);
		s.close();
		
			}


	
	}


