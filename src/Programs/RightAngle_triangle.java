package Programs;
import java.util.Scanner;

public class RightAngle_triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//scanner.useDelimiter("\s");
System.out.println("Enter the lengths of three sides of a triangle:");
System.out.print("Num 1: ");
double num1 = s.nextDouble();
System.out.print("num 2: ");
double num2 = s.nextDouble();
System.out.print("num 3: ");
double num3 = s.nextDouble();
boolean isRightTriangle = isRightTriangle(num1, num2, num3);
if (isRightTriangle) {
    System.out.println("It is a right triangle.");
} else {
    System.out.println("It is not a right triangle.");
}
s.close();
}
public static boolean isRightTriangle(double a, double b, double c) {
double[] num= {a, b, c};
java.util.Arrays.sort(num);
return Math.pow(num[0], 2) + Math.pow(num[1], 2) == Math.pow(num[2], 2);
}
}