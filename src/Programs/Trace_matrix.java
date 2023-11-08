package Programs;
import java.util.Scanner;

public class Trace_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, rows, columns, trace = 0;	
		Scanner s= new Scanner(System.in);	
		System.out.print("Enter Matrix Rows and Columns =  ");
		rows = s.nextInt();
		columns = s.nextInt();
		int[][] Tra_arr = new int[rows][columns];
		System.out.println("Please Enter the Matrix Items =  ");
		for(i = 0; i < rows; i++) 
		{
			for(j = 0; j < columns; j++) 
			{
				Tra_arr[i][j] = s.nextInt();
			}		
		}
		for(i = 0; i < rows; i++) 
		{
			for(j = 0; j < columns; j++) 
			{
				if(i == j)
				{
					trace = trace + Tra_arr[i][j];
				}
			}		
		}
		
		System.out.println("\nThe Trace Of the Matrix = " + trace);

	}
}
