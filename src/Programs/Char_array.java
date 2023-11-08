package Programs;

import java.util.Scanner;

public class Char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        String str1 = s.nextLine();
	String []words=str1.split(" ");
	System.out.println(words[1]+" "+words[0]);
	s.close();
	}

}
