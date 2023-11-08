package Programs;
import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
for(int i=2;i<=n/2;i++ ) {
	if(n/i==0){
		count++;
		System.out.println("Not a prime number");
		break;
	}
}
	if(count==0)
		System.out.println("Its a prime number");
	
s.close();
}
}