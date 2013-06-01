class TestArrayMethods
{
	public static void main(String [] args)
	{
		int [] array1 = {1,3,4,5,7};
		int [] array2 = {2,4,6,8,10,12};
		int [] array3 = new int[array1.length + array2.length];
		array3 = ArrayMethods.ArrayUnique(array1, array2);
	        
                for(int j = 0; j< array3.length;j++)
			System.out.println(array3[j]);
	}
}
