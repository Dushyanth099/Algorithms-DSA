package Programs;
		
public class Factorial_recursion {
static int factorial(int n) {
	if(n!=0)//termination condition
		return n*factorial(n-1);//recursive call
	else 
		return 1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3,result;
result=factorial(n);
System.out.println(n+ "factorial="+ result);
	}

}
