package Programs;
import java.util.Scanner;

public class Recursion_reverse {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in );
long n=s.nextLong();
callMyself(n);//5=54321
s.close();
	}
//the recursive java method
	public static void callMyself(long i) {
		// TODO Auto-generated method stub
if(i<=0) {
	return;
}
System.out.println(i+" ");
i=i-1;
callMyself(i);
}
}