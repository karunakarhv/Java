public class Shop
{
	private Item [] item;

	private static int idx;

	public Shop()
	{
		item = new Item[10];
	}
	public void addObject(Item it)
	{
		if(idx < 10)
		 item[idx++] = it;
	}
	public int getPrice()
	{
		int totalPrice = 0;
		for (int i = 0; i < idx; i++)
			totalPrice += item[i].getPrice();
		return totalPrice;
	}
}
