package Programs;

public class fibonacci_series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(long i=1;i<=8;i++) {
	System.out.print(fibonacci(i)+" ");
}
	System.out.println();
	}
/* a recursive fibonacci sequce in java program*/
	public static long fibonacci(long number) {
		if(number==1||number==2) {
			return 1;
		}
		return fibonacci(number-1)+fibonacci(number-2);
		}
}
