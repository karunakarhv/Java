public class Tester
{
	public static void main(String [] args)
	{
		Shop obj = new Shop();
		Item [] it = new Item[10];
		it[0] = new Pen(10);
		it[1] = new Chocolate(100);
		it[2] = new MenCloth(10);
		it[3] = new WomenCloth(100);
		for(int i = 0; i < 4; i++)
		obj.addObject(it[i]);
		System.out.println(obj.getPrice());
	}
}
