package Programs;

import java.util.Scanner;

public class SPlit_arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,position=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		System.out.print(arr[i]);}
		for(int i=0;i<position;i++) {
			arr[i]=s.nextInt();}
			for(int i=position;i<n;i++) {
			System.out.print(arr[i]);
			}
				s.close();
			}

	}
	
	
