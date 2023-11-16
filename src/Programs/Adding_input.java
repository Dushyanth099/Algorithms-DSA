	package Programs;
import java.util.Scanner;

public class Adding_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n;
	Scanner s=new Scanner (System.in);
	n=s.nextInt();
	for(int i=1;i<=n;i++) {
		int f=i*i+1;
		System.out.print(f+" ");
		s.close();
	}
}

}