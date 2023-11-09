package abstraction;
import java.util.*;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of ur choice");
		try {
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index want to access element:");
		int index = sc.nextInt();
		System.out.println("The array element at index is:"+ arr[index]);
        System.out.println("The array element succesfully accesed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
