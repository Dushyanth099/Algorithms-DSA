package Programs;
import java.util.Scanner;
public class removing_duplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter arrray size: ");
		n=s.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[n];
		System.out.println("read elements form user:");
		for(int i=0;i<n;i++){
		System.out.print("Enter array elements of index"+i+": ");
		arr[i]=s.nextInt();
		}
		System.out.println("before removeing duplicate elemets are: ");
		for (int i=0;i<n;i++)
        System.out.println(arr[i]);
		System.out.println("after removeing duplicate elemets are: ");
		for (int i=0;i<n;i++) {
			    flag=0;
			if(i==0)
				temp[count++]=arr[i];
			else{
				for(int j=0;j<count;j++)
				{
			if(arr[i]==temp[j])
				flag=1;
				}
	     	if(flag==0)
                temp[count++]=arr[i];
		}
		}
		for(int i=0;i<count;i++)
		System.out.println(temp[i]);
		s.close();
}
}