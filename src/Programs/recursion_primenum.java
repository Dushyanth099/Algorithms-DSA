package Programs;
import java.util.Scanner;
public class recursion_primenum {
static int number=2,count;
static int isprime(int number) {
	for(int j=2;j<=number/2;j++) {
		if(number%j==0) {
			number++;
			isprime(number);
		}
	}
if(count==0) {
	System.out.println(number+ " ");
	count++;
}
return number;
}
static void primenumber(int num) {//prime num(10)
	count=0;
	if(num==0)
		return;
	else {
		if(number==2) {
			System.out.println(number+" ");
	number++;
	}
	else {
		number=isprime(number);
		number++;
	}
}
	primenumber	(--num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
primenumber(n);
		s.close();	
	}
}
