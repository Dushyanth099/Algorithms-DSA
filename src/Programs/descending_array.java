package Programs;
import java.util.Scanner;

public class descending_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) { 
		arr[i]=s.nextInt();
		}//sorting the elements
		for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) { 
			if (arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
s.close();
		}
		}//print the array after sorting
		System.out.println("Descending order: ");	
		for(int i=0;i<n;i++) 
			System.out.print(arr[i]+" ");
	}
}

