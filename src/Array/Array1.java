/*WAP to create an array with 10 size and of int holding ability. 
Store values 1-10 in it. 
Using the length variable, access each element of the array and print it to the console. 
Create the array in 2 ways - 
1.Using the new operator and then storing the values individually, 
2.Creating the array with the values directly in the array. 
Loop over the array using an index variable and the enhanced for as well.*/


class Array1
{
	public static void main2(String[] args)
	{
		int [] arr = new int [10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;	
		arr[9] = 10;
	//	arr[20] = 11; ArrayIndexOutofBounds Exception: index number
	// File name:Line Number

		for(int i =0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10};

/*		for(int i =0; i < arr.length; i++)
			System.out.println(arr[i]);*/
		for(int i : arr)
			System.out.println(i);
		
	}
} 
