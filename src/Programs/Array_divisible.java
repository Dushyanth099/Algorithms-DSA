package Programs;
import java.util.Scanner;

public class Array_divisible {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the elements:");
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = n; i<n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 2 == 0 && sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    s.close();
    }
}