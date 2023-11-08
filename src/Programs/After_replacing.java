package Programs;
import java.util.Scanner;

/*public class test2 {
static void replaceelement(int arr[],int n){
	int max,temp;
	max=arr[n-1];
	for(int i=n-2;i>=0;i--) {
		temp=arr[i];
		arr[i]=max;
		if(temp>max)
			max=temp;
	}
	arr[n-1]=0;}
static void printArray(int arr[],int n) {
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
System.out.print("Enter the elements one by one: ");
	for(int i=0;i<n;i++) {
	arr[i]=s.nextint();
replaceelement(arr,n);
printArray(arr,n);
}}
	}

*/
public class After_replacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter no of elemnts: ");
int n =s.nextInt();
int[] arr = new int[n];
System.out.println("enter the elements: ");
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
int max = arr[n-1];
arr[n-1] = 0;
for(int i=n-2;i>=0;i--) {
	int temp =arr[i];
	arr[i] = max;
	if(temp>max) {
		max = temp;
	}
}
System.out.println("after replacing: ");
for(int num:arr) {
	System.out.println(num+" ");
}
	}

}