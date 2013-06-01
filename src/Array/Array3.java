/*Integer inputs from the user via the command line (as strings). 
Depending on how many elements have been passed, create an int array with the size 
and using Integer.parseInt() convert the string inputs 
and store them in the array 
and print out the values to the console.*/

class Array3
{
	public static void main(String[] args)
	{
	    int [] array = new int[args.length];
	    for(int i = 0; i < args.length; i++)
		array[i] = Integer.parseInt(args[i]);
	    for(int i = 0; i < array.length; i++)
		System.out.println(array[i]);
		
	}
}
