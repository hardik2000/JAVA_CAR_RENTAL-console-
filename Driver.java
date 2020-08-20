
import java.io.*;
import java.util.Scanner;  
import java.lang.Math;

public class Driver extends Vehicle implements Person
{

	public String[] name=new String[6];
	private String[] Phoneno=new String[6];
	private String[] Licenseno=new String[6];
	public int Rate;
	Scanner sc =new Scanner(System.in);
	Driver()
	{
		name[0]="Rahul Meet";
		name[1]="Kamal Dass";
		name[2]="Arjun Singh";
		name[3]="kamal Singh";
		name[4]="deep Singh";
		name[5]="kapeel Dev";
		
		
		Phoneno[0]="7011456987";
		Phoneno[1]="1478965230";
		Phoneno[2]="1254789630";
		Phoneno[3]="1254712547";
		Phoneno[4]="1254712542";
		Phoneno[5]="1254798999";
		
		Licenseno[0]="MC12547896";
		Licenseno[1]="NC12563478";
		Licenseno[2]="ABG5223698";
		Licenseno[3]="ASD4523698";
		Licenseno[4]="ND14523698";
		Licenseno[5]="MN11542980";
		
		
	}	
	public String ShowDetails(int k)
	{
		String outMe="";
		outMe += String.format("----------------------------------------------------------------\n");
		outMe += String.format("	THE DETAILS OF THE DRIVER ARE AS FOLLOWS	: \n");
		outMe += String.format("	NAME							:%s\n",name[k-1]);
		outMe += String.format("	PHONENO							:%s\n",Phoneno[k-1]);
		outMe += String.format("	LICENSENO						:%s\n",Licenseno[k-1]);
		return (outMe);
		
	}	
	public int ShowRate()
	{
		if(type.equals("Micro"))
		{
			Rate=100;
		}
		else if(type.equals("Mini"))
		{
			Rate=200;
		}
		else if(type.equals("Seden"))
		{
			Rate=300;
		}
		return Rate;
	}
		
}	