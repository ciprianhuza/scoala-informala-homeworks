
 // sum of first 100 numbers
 
class SolutionSum
{
	public static void main(String args[])
	{
		int sum = 0;
		for(int i = 1;i <= 100; i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of First "+100+" Numbers are:" + sum);
	}
}