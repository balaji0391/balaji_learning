public class SwapNum
{
	public static void main(String args[])
        {
		int a=23;
		int b=32;
		
	System.out.println("Numbers are:", +a ,+b)

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Swapped numbers:" +a, +b);
        }
}