public class Person extends Spanner
{
	private String name;
	public Person(String n)
	{
	      name = n;
	}
	public void run()
	{
		System.out.println("Runs Shouting..." + name);
	}
}
