import java.util.Scanner;
import java.lang.Math;

public class PrNum
{
   public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
 
      String  primeNumbers = "";
      System.out.println("Introduceti valoarea n=:");
      int n = scanner.nextInt();
      scanner.close();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Numerele prime de la  1 la n sunt :");
      System.out.println(primeNumbers);
   }
}

