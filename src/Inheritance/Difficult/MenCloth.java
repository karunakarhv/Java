public class MenCloth extends Clothes
{
	private int price;
	public MenCloth()
	{
		super();
	}
	public MenCloth(int p)
	{	
		price = p;
	}
	public void description()
	{
		System.out.println("Item---MenCloth---Woah!!");
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
