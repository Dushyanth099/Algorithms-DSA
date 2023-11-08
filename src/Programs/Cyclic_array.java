package Programs;
import java.util.Scanner;

public class Cyclic_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        System.out.print("Enter the n of the array: ");
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }
	        int Element = arr[0];
	        for (int i = 0; i < n - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        arr[n - 1] = Element;
	        System.out.println("Cyclically Permuted Array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	s.close();    }
}