public class EvenNumber
{
	public static boolean isEven(int num)
	{
		if((num%2) == 0)
			return true;
		if((num%2) != 0)
			return false;
		return true;
	}
	public static void main(String [] args)
	{
		boolean result = EvenNumber.isEven(2);

		if(result == true)
			System.out.println("Number is Even");
		if(result == false)
			System.out.println("Number is Odd");	
	}
}
