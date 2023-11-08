package Programs;

public class matrix_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=3,col=3;
int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
System.out.println("2d matrix A:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++)
			System.out.print(a[i][j]+" ");
		System.out.println();
	}
	}

}
