package Programs;
import java.util.Scanner;

public class Sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the n of the array: ");
n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) {
    arr[i] = s.nextInt();
}
for (int i = 0; i < n; i++) {	
sum+=arr[i];
}
double avg=(double)sum/n;
	
System.out.println(sum);
System.out.println(avg);
	}
}