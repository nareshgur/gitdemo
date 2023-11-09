package abstraction;

class AgeerrorException extends Throwable {
	public void AgeerrorException() {
		System.out.println("Sorry! Your are nor eligible");
	}
}

public class main 
{
	void age(String name,int age) throws AgeerrorException
	{
		if(age<18&&age>=60)
		{
			throw new AgeerrorException();
		}
		else
		{
			System.out.println("Your Welcome.");
		}
	}
	public static void main(String [] args)
	{ 
		
		try
		{
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			main m = new main ();
			m.age(name,age);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please age proper age:");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter ur age:");
		}
		catch(AgeerrorException e)
		{
			System.out.println(e.getMessage());
		}}
		
	
	
}