package Programs;

import java.util.Scanner;

public class Square_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
	int N=s.nextInt();
	int M=s.nextInt();
	if(N==M)
		System.out.println("Yes");
	else
		System.out.println("No");
	s.close();
}
}