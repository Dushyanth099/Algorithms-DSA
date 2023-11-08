package Programs;

import java.util.Scanner;

public class asciiprogram_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		char ch;
		Scanner s=new Scanner(System.in);
			System.out.print("Enter the num=");
			n=s.nextInt();
			for (int i=1;i<=n;i++) {
				ch='A';
				for (int j=1;j<=i;j++) {
					 System.out.print(ch++);
					 
				s.close();	
			
				}
				System.out.println();
			}
			
			
			}

	}


