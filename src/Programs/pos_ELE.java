package Programs;
import java.util.Scanner;

public class pos_ELE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the no of elements:");
			int n=s.nextInt();
			int arr[]=new int [n];
			System.out.print("Enter the array elements one by one:");
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();	
		   System.out.print("Enter the element you want to delete:");
			int pos=s.nextInt();
			int j=pos;
			while(j<n) {
				arr[j-1]=arr[j];
				j++;
			}
			System.out.println("Array traverse:");
			for(int i=0;i<n-1;i++)
				System.out.print(arr[i]+" ");
		s.close();
		}
	}