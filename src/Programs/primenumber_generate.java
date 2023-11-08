package Programs;

import java.util.Scanner;

public class primenumber_generate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,number=2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++ ) {
		if (number==2) {
			System.out.println(2+" ");
			number++;
		}
		else {
			Task:
		for(int j=2;j<=number/2;j++) {
			//count=27,27%3==0}if(count%j==0) 
			if(number%j==0) {
				number++;
			continue Task;
			}
		}	
		s.close();
			System.out.println(number++ +" ");	
				}
		}
	}
}