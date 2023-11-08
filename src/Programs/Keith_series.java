package Programs;
import java.util.Scanner;

public class Keith_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7,f4;
Scanner s=new Scanner(System.in);
System.out.println("Enter the f1 :");
int f1=s.nextInt();
System.out.println("Enter the f2 :");
int f2=s.nextInt();
System.out.println("Enter the f3 :");
int f3=s.nextInt();

		System.out.print(f1+" "+f2+" "+f3+" ");
		for(int i=2;i<n;i++)
		{
			f4=f1+f2+f3;
			System.out.print(f4+" ");
			f1=f2;
			f2=f3;
			f3=f4;
	
}

}

}
