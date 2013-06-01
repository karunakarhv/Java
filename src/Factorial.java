public class Factorial
{
	public static int genFact(int num)
	{
		System.out.println(num);
		int result = 1;
		if(num == 0)
			return result;
		if(num < 0)
			return 0;
		for(;num != 1; num--)
		{
			result = result * num;
			if (result < 0)
				return 0;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int result = Factorial.genFact(1.1);
		if((result == 1) || (result > 1))
			System.out.println("Value is" + result);
		if(result == 0)
			System.out.println("Not Valid number");
	}
}
