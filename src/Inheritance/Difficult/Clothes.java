public class Clothes extends Item
{
	private int price;
	public Clothes()
	{
		super();
	}
	public Clothes(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---Clothes---Woah!!");
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
