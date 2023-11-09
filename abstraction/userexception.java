package abstraction;

import java.util.Scanner;

class NegtiveValueException extends Throwable{
  public void NegtiveValueException() {
		System.out.println("please enter positive value.");
	}
}
class OutofRangeValueException extends Throwable{
	public void OutofRangeValue() {
		System.out.println("Enter within range");
	}
}
public class userexception{
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<2;i++)
	{
		String name = "";
		int sub1=0;
		int sub2=0;
		int sub3=0;
		try
		{
			System.out.println("Enter The Name and Marks of the student:");
			name = sc.nextLine();
			if(sc.hasNextInt())
				sub1=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sc.hasNextInt())
				sub2=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sc.hasNextInt()) {
				sub3=sc.nextInt();
				sc.nextLine();
			}
			else throw new NumberFormatException();
			if(sub1<0) throw new NegtiveValueException();
			if(sub1>100) throw new OutofRangeValueException();
			
			if(sub2<0) throw new NegtiveValueException();
			if(sub2>100) throw new OutofRangeValueException();
			
			if(sub3<0) throw new NegtiveValueException();
			if(sub3>100) throw new OutofRangeValueException();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NegtiveValueException e)
		{
			System.out.println(e.getMessage());
		}
		catch(OutofRangeValueException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Name:" +name);
		System.out.println("Marks of sub1 :"+sub1);
		System.out.println("Marks of sub2 :" +sub2);
		System.out.println("Marks of sub3 :"+sub3);
	}
}
}