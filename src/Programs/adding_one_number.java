package Programs;
import java.util.Scanner;
public class adding_one_number{
	public static void main(String[] args) {
int n,r,reverse=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
n=s.nextInt();
	while(n>0) {
		r=n%10;
		reverse=reverse*10+(++r);
		n=n/10;	
	//}
	//while (reverse!=0){
		//r=reverse%10;
		System.out.print(n);
	//	reverse=reverse/10;
	}
	s.close();
}

	}