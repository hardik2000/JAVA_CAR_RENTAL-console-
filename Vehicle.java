
import java.io.*;
import java.util.Scanner;  
import java.lang.Math;

public class Vehicle extends Car
{
	private String mfgyear,capacity,fueltype,color;
	public String type,number;
	public boolean status;
	private int Rate;
	Scanner sc =new Scanner(System.in);
	Vehicle()
	{
		type="";
		mfgyear="";
		capacity="";
		fueltype="";
		color="";
		number="";
		Rate=0;
		status=true;
	}	
	public String ShowDetails()
	{
		String outMe="";
		outMe += String.format("----------------------------------------------------------------\n");
		outMe += String.format("	THE DETAILS ARE AS FOLLOWS	: \n\n");
		outMe += String.format("	TYPE							:%s\n",type);
		outMe += String.format("	MFG YEAR						:%s\n",mfgyear);
		outMe += String.format("	NO OF PERSONS ALLOWED					:%s\n",capacity);
		outMe += String.format("	FUEL TYPE						:%s\n",fueltype);
		outMe += String.format("	COLOR OF THE BODY					:%s\n",color);
		outMe += String.format("	PLATE NUMBER						:%s\n\n",number);
		return (outMe);
	}	
	public void InsertData(String type,String mfgyear,String capacity,String fueltype,String color,String number)
	{
		this.type=type;
		this.mfgyear=mfgyear;
		this.capacity=capacity;
		this.fueltype=fueltype;
		this.color=color;
		this.number=number;
		this.status=true;
		
	}	
	public int ShowRate()
	{
		if(this.type.equals("Micro"))
		{
			Rate=50;
		}
		else if(this.type.equals("Mini"))
		{
			Rate=25;
		}
		else if(this.type.equals("Seden"))
		{
			Rate=75;
		}
		return Rate;
	}	


}	