package Programs;
import java.util.Scanner;

public class second_smallest_second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) { 
		arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) { 
			arr[i]=s.nextInt();
			}//sorting the elements
			for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) { 
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
	s.close();
			}
			}//print the array after sorting
				for(int i=0;i<n;i++) 
				System.out.println("second smallest:"+arr[1]);
				System.out.print("second largest:"+arr[n-2]);
	}
	}
