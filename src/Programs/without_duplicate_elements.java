package Programs;
import java.util.Scanner;

public class without_duplicate_elements {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter arrray size: ");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)		
		arr[i]=s.nextInt();
		System.out.println("The elemets are: ");
		for (int i=0;i<n;i++) {
		count=0;
		for(int j=0;j<n;j++)
		if(arr[i]==arr[j] && i!=j)
		count++;
		if(count==0)
		System.out.println(arr[i]+"");
		flag=1;
		}
		s.close();
        if (flag==0)	
        System.out.println("all elements are repeated");
        s.close();
        }
        }