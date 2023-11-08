package Programs;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=7;
System.out.print("Beforre swapping,a=");
System.out.print(a);
System.out.print(" ");
System.out.print("b=");
System.out.print(b);
System.out.println("");
	a^=b;//a=a^b 101 ^ 111=010
	b^=a;//a=a^b 111 ^ 111=010=5=b
	a^=b;//a=a^b 010 ^ 101=111=7=a
	System.out.print("After swapping,a=");
	System.out.print(a);
	System.out.print(" ");
	System.out.print("b=");
	System.out.print(b);
	System.out.println(b);

	}

}
