package pattern;

import java.util.Scanner;

public class BOX_output_missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number=" );
		n=s.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=n;j>=i;j--) {
	if(i==1 || i==n||j==1||j==n) {
		System.out.print("*");
	}
		else {
			System.out.print(" ");
		}
	{
		System.out.println();
				}
		
s.close();
		}
				}
			}
}