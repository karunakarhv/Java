public class Pen extends Item
{
	private int price;
	public Pen()
	{
		super();
	}
	public Pen(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---Pen---Woah!!");
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
