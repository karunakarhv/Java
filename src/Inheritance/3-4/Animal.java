public class Animal
{
	public Animal()
	{
		System.out.println("Inside Animal's Constructor");
	}
	protected void smoke()
	{
		System.out.println("I am smoking");
	}
	private void smoke(int idx)
	{
		System.out.println("Inside Oveloaded Method Smoke");
	}
	private void cook()
	{
		System.out.println("I am cooking");
	}
	private void play()
	{
		System.out.println("I am playing");
	}
}
