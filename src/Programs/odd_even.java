package Programs;
import java.util.Scanner;
public class odd_even {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,e=0,o=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements: ");
n=s.nextInt();
int arr[]=new int[n];
int odd[]=new int[n];
int even[]=new int[n];
System.out.println("enter all elements: ");
for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
	for(int i=0;i<n;i++){
		if(arr[i]%2==0)
			even[e++]=arr[i];
		else
			odd[o++]=arr[i];
	}
	System.out.print("odd: ");
	for(int i=0;i<o;i++){
		if(i==o-1) {
		System.out.println(odd[i]);
		}
		else
	System.out.print(odd[i]+", ");
	}
		System.out.print("\nEven: ");
		for(int i=0;i<e;i++){
		if(i==e-1)
			System.out.print(even[i]);	
			else
				System.out.print(even[i]+", ");
					}
		s.close();
	}
}