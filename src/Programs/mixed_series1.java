package Programs;
import java.util.Scanner;

public class mixed_series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter ther numbers to generate the series:");
int	n=s.nextInt();
	int fact;
	int number=1;
	for(int i=0;i<n;i++) {
fact=1;
		if(i%2==0)
		System.out.println(i+" ");
	else {
		for(int j=1;i<=number;j++) {
	fact=fact*j;
		}
	System.out.print(fact+" ");
	number++;
	}
	}
s.close();

}
}