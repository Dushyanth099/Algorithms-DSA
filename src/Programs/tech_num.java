package Programs;
import java.util.Scanner;

public class tech_num {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
int n,result;
    Scanner s=new Scanner(System.in);
System.out.println("Enter the input:");
n=s.nextInt();
String str=String.valueOf(n);
if(str.length()==4) {
	result=(int)Math.pow((n/100)+(n%100),2);
	if(n==result)
System.out.println(n+"is a tech number");
else
	System.out.println(n+" is not a tech number");
	}
	else
		System.out.println("not a valid number");
	s.close();
}
	}
