public class Posters extends Item
{
	private int price;
	public Posters()
	{
		super();
	}
	public Posters(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---Posters---Woah!!");
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
