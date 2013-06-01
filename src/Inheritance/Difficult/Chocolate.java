public class Chocolate extends Item
{
	private int price;
	public Chocolate()
	{
		super();
	}
	public Chocolate(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---Chocolate---Woah!!");
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
