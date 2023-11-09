package abstraction;

abstract class Compartment {
	abstract void notice();
}
class FirstClass extends Compartment{
	void notice()
	{
		System.out.println("This is first class");
	}
}
class Ladies extends Compartment{
	void notice()
	{
		System.out.println("This is ladies class");
	}
}
class Luggage extends Compartment{
	void notice() {
		System.out.println("This is Luggage class");
	}
}
class General extends Compartment{
	void notice()
	{
		System.out.println("This is a General");
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c[] = new Compartment[10];
		double i = Math.random()*5;
		int x = (int)i;
		switch(x)
		{
		case 1:
			c[0] = new FirstClass();
			c[0].notice();
			break;
		case 2:
			c[1] = new Ladies();
			c[1].notice();
			break;
		case 3:
			c[2] = new Luggage();
			c[2].notice();
			break;
		case 4:
			c[3] = new General();
			c[3].notice();
			break;
		default:
			System.out.println("Invalid");
			
		}

	}

}
