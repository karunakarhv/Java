/*WAP to create a 2 dimensional int array with 3 as first dimension size. 
Create unidimensional arrays with size 2 and store numbers in the 2-D array. 
Now loop over the arrays and display the value accordingly.*/


class Array2
{
	public static void main(String [] args)
	{
		int [][] array1 = new int[3][2];
		int [] array2 = new int [2];

		array1[0][0] = 1;
		array1[0][1] = 1;
//		array1[0][2] = 1;
		 
		array1[2][0] = 1;
		for(int i =0;i < 3;i++)
			for(int j=0;j<2;j++)
			System.out.println(array1[i][j]);
		
	}
}
