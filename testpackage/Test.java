package testpackage;
import testpackage.Foundation;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation f = new Foundation();
		// error for accessing int a  = f.var1;
		int b = f.var2;
		int c = f.var3;
		int d = f.var4;
		System.out.println("The value of var4 : "+d);
		System.out.println("The value od var2: "+b);
		System.out.println("The value of var3: "+ c);

	}

}
