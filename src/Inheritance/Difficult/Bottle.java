public class Bottle extends Item
{
	private int price;
	public Bottle()
	{
		super();
	}
	public Bottle(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---Bottle---Woah!!");
	}
	public int getPrice()
	{	
		return price;
	}
	public void setPrice(int p)
	{
		price = p;
	}
}
