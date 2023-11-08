package Programs;
import java.util.Scanner;

public class largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Num Size: ");
		
		int n=s.nextInt();
		
		System.out.println("Enter Numbers : ");
		int arr[] = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		int max = arr[0];
	int min=arr[0];
		  for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] > max)  
	               max = arr[i];  
     		  if(arr[i] < min)  
                   min = arr[i];  
       }  
		   System.out.println("Largest element present in given array: " + max); 
		   System.out.println("Largest element present in given array: " + min); 
s.close();

	}

}
