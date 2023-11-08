package Programs;
import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 int difference=0;
	        System.out.print("Enter the number of elements in the array: ");
	        int n = s.nextInt();

	        if (n <= 0) {
	            System.out.println("Enter a valid array size.");
	            return;
	        }

	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }

	        int min = 0;
	        int max = 0;

	        for (int i = 1; i < n; i++) {
	            if (arr[i] < arr[min]) {
	                min = i;
	            }
	            if (arr[i] > arr[max]) {
	                max = i;
	            }
	        }

	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);
	      
	   for(int i=0;i<n;i++) {
	int  difference1=(min-max);
	       System.out.print(difference1);
	   }
	    }
}