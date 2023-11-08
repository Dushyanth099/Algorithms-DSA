package Programs;

public class powerof2 {
static public boolean ispowerOfTwo(int x)
{
	return(x!=0)&&((x&(x-1))==0);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ispowerOfTwo(10));
	}
}
