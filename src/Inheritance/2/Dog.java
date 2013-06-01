public class Dog extends Food
{
	String name_dog;
	Dog(String n)
	{
		name_dog = n;
	}
	public void eat()
	{
		System.out.println("I Can eat whatever I want");
	}
	public void eat(String foodType,int dummy)
	{
		/*
		switch(foodType)
		{
			case VEG:
			{
				System.out.println("Veg Food");	
			}
			break;
			case NONVEG:
			{
				System.out.println("Non Veg Food");
			}
			break;
	        	case SEAFOOD:
			{
				System.out.println("Sea Food");
			}
			break;
		}*/
		if(foodType.equals(food[0]))
		{
			System.out.println("Veg Food");	
		}
		else if(foodType.equals(food[1]))
		{
			System.out.println("Non Veg Food");	
		}
		else if(foodType.equals(food[2]))
		{
			System.out.println("Sea Food");	
		}
		
	}
	public void eat(String food)
	{
		if(food.equals(name[0]))
		{
			System.out.println(name[0]);
			eat("Veg",1);
			System.out.println("Taste: Good");
		}
	}
	public void bark()
	{
		System.out.println("Bow- Bow");
	}
}
