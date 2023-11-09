package abstraction;

public class arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    if(args.length<5)
    {
    	System.out.println("Enter atleast 5 elements");
    	return;
    }
    int sum=0;
    int [] numbers = new int[5];
   try
   {
	   for(int i=0;i<args.length;i++)
	   {
		   numbers[i] = Integer.parseInt(args[i]);
	   }
	   for(int num:numbers)
	   {
		   sum+=num;
	   }
	   double avg = (double)sum/numbers.length;
	   System.out.println("The sum is "+ sum);
	   System.out.println("The average is :"+avg);
   }
   catch(NumberFormatException e)
   {
	   System.out.println(e);
   }
   catch(ArithmeticException e)
   {
	   System.out.println(e);
   }
  
	}

}

