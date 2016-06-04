public class revNum
{
	public static void main(String args[])
        {
		int num=23986;
		int temp=0;
		int rNum=0;

		while(num>0)
		{
			temp=num%10;
			rNum=rNum*10+temp;
			num=num/10;
}

		System.out.println("reverse number:"+rNum);
        }
}