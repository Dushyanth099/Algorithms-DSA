package Programs;

import java.util.Scanner;

public class Ascii_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,ascii;
Scanner s=new Scanner(System.in);
	System.out.print("Enter the num=");
	n=s.nextInt();
	for (int i=1;i<=n;i++) {
		ascii=65;
		for (int j=1;j<=i;j++) {
			System.out.printf("%c",ascii);
			ascii++;
		s.close();	
	
		}
		System.out.println();
	}
	}
}
