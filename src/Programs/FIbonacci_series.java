package Programs;

public class FIbonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9, f1=0, f2=1, f3;
System.out.print(f1+ " "+f2 +" ");
for(int i=2;i<n;i++) {
	f3=f1+f2;
	System.out.print(f3+" ");
	f1=f2;
	f2=f3;
	
}
	}

}
