public class PrimitiveDataType
{
	int size;
	public void doSomething()
	{
		size = 0;
		System.out.println("Hello Bosss" + size);
	}
	
	public static void main(String[] args)
	{
		PrimitiveDataType obj = new PrimitiveDataType();
		obj.doSomething();
		System.out.println(sizeof(obj));
	}
}
