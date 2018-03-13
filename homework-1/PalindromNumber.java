class PalindromNumber
{
public static void main(String[] str)
    {
        int a=858, n=a, b=a, rev=0;
        while(n>0)
		{
                    a=n%10; 
					n=n/10;
					rev=rev*10+a;
                    System.out.println(a+"  "+n+"  "+rev);  
        }
        if(rev==b)  System.out.println("Palindrome");
        else        System.out.println("Not Palindrome");
    }
}