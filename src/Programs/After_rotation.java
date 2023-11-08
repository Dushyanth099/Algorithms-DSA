package Programs;
import java.util.Scanner;

public class After_rotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of elements: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i] =s.nextInt();
		}
		System.out.println("enter n value: ");
		int rotate = s.nextInt();
		rotate %= n;
		int[] rotatedArray = new int[n];
		for(int i=0;i<n;i++) {
			int newIndex = (i-rotate + n)% n;
			rotatedArray[newIndex] = arr[i];
					 
		}
		System.out.println("after rotation:");
		for(int num:rotatedArray) {
			System.out.println(num + " ");
			s.close();
		}
			}

		}
