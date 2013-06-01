public class WomenCloth extends Clothes
{
	private int price;
	public WomenCloth()
	{
		super();
	}
	public WomenCloth(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---WomenCloth---Woah!!");
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
