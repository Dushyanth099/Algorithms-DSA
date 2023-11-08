package Programs;

import java.util.Scanner;

public class sum_natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter the numbers =");
n=s.nextInt();
for(int i=1;i<=n;i++) {
	sum=sum+i;
	s.close();
}
System.out.println(sum);
}

}
