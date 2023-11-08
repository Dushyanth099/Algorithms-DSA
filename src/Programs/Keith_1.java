package Programs;
import java.util.Scanner;

public class Keith_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int f1,f2,f3,f4;
	String str1=String.valueOf(n);
	if(str1.length()==3){
	f3=n%10;//f3=2
	n=n/10;
	f2=n%10;//f2=4
	n=n/10;
	f1=n%10;//f1=7
	System.out.print(f1+" "+f2+" "+f3+" ");
	for(int i=3;i<=10;i++) {
		f4=f1+f2+f3;
		System.out.print(f4+" ");
	f1=f2;
	f2=f3;
	f3=f4;
	}
	}
	}
}
