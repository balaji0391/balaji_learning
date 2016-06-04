public class LandS
{
	public static void main(String args[])
	{
		//Arrays need to be zero indexed
		int a[]=new int[]{23,33,43,53};
		int small=a[1];
		int large=a[1];

		//Use array.length instead of hardcoding values
		for(int i=1;i<4;i++)
		{
			if(a[i]>large)
				large=a[i];
			else if(a[i]<small)
				small=a[i];
		}

		System.out.println("Large Number is :" +large);
		System.out.println("Small Number is :" +small);
		
	}
}
