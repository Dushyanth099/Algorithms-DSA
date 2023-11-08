package Programs;
import java.util.Scanner;

public class find_primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the minimum value:");
		int min=s.nextInt();
		System.out.println("Enter the maximum value:");
		int max=s.nextInt();
		System.out.println("Prime numbers are:");
		for(int n=min;n<=max;n++ ) {
			int count=0;
			for(int i=2;i<=n/2;i++) {
			if(n%i==0) {		
			count++;
		break;
			}
			}
		if(count==0 && n!=1)
			System.out.print(n+" ");
		}
		s.close();
		}
		}