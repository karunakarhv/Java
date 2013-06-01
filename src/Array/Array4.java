/*WAP to create an array of strings with 5 colors as values. 
Use Math.random() to randomly print out the values from the array.*/

class Array4
{
	public static void main(String [] args)
	{
		String [] array = new String[5];
		array[0] = "Red";
		array[1] = "Green";
		array[2] = "Blue";
		array[3] = "Yellow";
		array[4] = "Cyan";
		int i = (int)(10 * Math.random());
                if((i > 0 ) && (i < 5))
		System.out.println(array[i]);
		else
		System.out.println("Undefined Color");	
	}
}
