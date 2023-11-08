package Programs;
import java.util.Scanner;

public class reverse_noof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,rot=0,x=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the no of elements:");
			 n=s.nextInt();
			int arr[]=new int [n];
			System.out.print("Enter the array elements one by one:");
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();	
			
		   System.out.print("Enter the numberof rotation:");
		   rot=s.nextInt();
		   for(int r=0;r<rot;r++) {
			x=arr[n-1];
			for(int i=n-1;i>0;i--)
				arr[i]=arr[i-1];
			arr[0]=x;
			System.out.println("Rotated array:");
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			s.close();
}
}
}