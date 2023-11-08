package Programs;

import java.util.Scanner;

public class array_each_num_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count=0,element=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        n = s.nextInt();
        for(int i = 0; i < n; i++)  {
            if(arr[i] == element)
                count++;
        }
        System.out.println("Number of Occurrence of the Element:"+count);
        s.close();
    }
}