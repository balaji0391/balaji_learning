public class Swap
{
	public static void main(String args[])
	{
		int a=15;
		int b=31;
		System.out.println("Before:" +a);
		System.out.println("First Num is:" +a);
		System.out.println("Second Num is:" +b);
		swapNum(a,b);	
	}

		public static void swapNum(int a, int b)
		{
			int temp=a;
			a=b;
			b=temp;
			System.out.println("After:" +a);
			System.out.println("First Num is:" +a);
			System.out.println("Second Num is:" +b);
	
		}
}