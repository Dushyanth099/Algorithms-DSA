package Programs;
import java.util.Scanner;

public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row,col;
Scanner s=new Scanner(System.in);
	System.out.println("enter the row: ");
	row=s.nextInt();
	System.out.println("enter the col: ");
	col=s.nextInt();
	int a[][]=new int[row][col];
	for(int i=0;i<row;i++) {		
		for(int j=0;j<col;j++) {
			a[i][j]=s.nextInt();
		}
	}
		System.out.println("Transpose of matrix:");
			for(int i=0;i<row;i++) {		
				for(int j=0;j<col;j++) 
					System.out.print(a[j][i]+" ");
				System.out.println();

}
s.close();
	}
}
	