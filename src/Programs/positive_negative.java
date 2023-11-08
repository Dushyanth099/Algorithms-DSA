package Programs;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number=");
n=s.nextInt();
if(n>0){
System.out.println("Positive Number");
}
else if(n==0) {
	System.out.println("zero");
}
	else{
		System.out.println("Negative number");
		s.close();
	}
	
}

}