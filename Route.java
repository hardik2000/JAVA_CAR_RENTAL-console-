//compile first using javac -d . Route.javah
package Way;
import java.io.*;
import java.util.Scanner;  
import java.lang.*;

public class Route 
{

	private String from,to,via;
	private int fare;
	public String a;
	Scanner sc =new Scanner(System.in);
		
	public Route() 
	{
		from="";
		to="";
		via="";
		fare=100;
		
		//code to read from file
		
	}
	public void TakeData() 
	{
		from="";
		to="";
		via="";
		do
		{
			System.out.println("----------------------------------------------------------------------------");
			
			System.out.println("PLEASE ENTER THE FOLLOWING DETAILS :");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			do
			{
				System.out.print("FROM		:");
				from=sc.nextLine();
			}while(from.equals(""));
			do
			{
				System.out.print("To		:");
				to=sc.nextLine();
			}while(to.equals(""));
			System.out.print("VIA		:");
			via=sc.nextLine();
			System.out.println("");
			System.out.println("");
			
			System.out.println("PRESS F TO PROCEED   OR    C TO  CHANGE");
			a=sc.nextLine();
		}while(a.equals("c") || a.equals("C"));
			
	}	
	
	public String ShowData()
	{
		String outMe="";
		outMe += String.format("------------------------------------------------------------------------");
		outMe += String.format("\n");
		outMe += String.format("	FINAL  DETAILS  ARE  :\n");
		outMe += String.format("\n");
		outMe += String.format("	FROM		:%s\n",from);
		outMe += String.format("\n");
		outMe += String.format("	TO		:%s\n",to);
		outMe += String.format("\n");
		
		if(!via.equals(""))
		{
			outMe += String.format("	VIA		:%s\n",via);
			outMe += String.format("\n");
			
		}
		return outMe;
		
	}	

	public int ShowFare()
	{
		if(via.equals(""))
		{
			int max = 225; 
			int min = 100; 
			int range = max - min + 1; 
	  
			// generate random numbers within 1 to 10 
			int rand = (int)(Math.random() * range) + min; 		
			fare=fare+rand;
		}
		else
		{		
			int max = 500; 
			int min = 250; 
			int range = max - min + 1; 
	  
			// generate random numbers within 1 to 10 
			int rand = (int)(Math.random() * range) + min; 		
			fare=fare+rand;
		}
		
		return fare;
	}	

}
