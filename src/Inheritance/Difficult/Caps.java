public class Caps extends Item
{
	private int price;
	public Caps()
	{
		super();
	}
	public Caps(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---Caps---Woah!!");
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
