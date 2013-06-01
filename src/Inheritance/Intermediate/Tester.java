public class Tester
{
	public static void main(String [] args)
	{	
		Tool t = new Spanner();
		t.operation();
		Person p = new Person("karun");
		p.operation(p);
	}
}
