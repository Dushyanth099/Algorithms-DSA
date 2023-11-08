package Programs;
import java.util.Scanner;

public class no_of_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
		}	
		System.out.println("enter the element which you want to occurance:");
		int element=s.nextInt();
		for(int i=0;i<n;i++) {
		if(arr[i]==element) {
		count++;
		}
		s.close();
	}
		System.out.println("number of occurance of the element:"+count);
				
	}
}