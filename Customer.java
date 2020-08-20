
import java.io.*;
import java.util.Scanner;  
import java.lang.Math;

public class Customer implements Person
{

	private String firstname, lastname,mobileno,emailid,username,password,confirmpassword,loginid;
	private boolean Loginstatus=false;
	Scanner sc =new Scanner(System.in);
		
	public Customer() 
	{
		firstname="";
		lastname="";
		mobileno="";
		emailid="";
		username="";
		password="";
		confirmpassword="";
		loginid="";
		
		//code to read from file
		
	}
	public boolean CheckData() throws Exception
	{
		String loginid="",password="";
		Loginstatus=false;
		System.out.println("PLEASE ENTER THE FOLLOWING DETAILS  FOR LOGIN :");
		do
		{
			System.out.print("LOGINID		:");
			loginid=sc.nextLine();
		}while(loginid.equals(""));
		do
		{
			System.out.print("PASSWORD		:");
			password=sc.nextLine();
		}while(password.equals(""));

		File file = new File("data.txt"); 
		Scanner sc = new Scanner(file); 
  
		while (sc.hasNextLine() && !Loginstatus)
		{
			this.firstname=sc.nextLine();
			this.lastname=sc.nextLine();
			this.mobileno=sc.nextLine();
			this.emailid=sc.nextLine();
			this.username=sc.nextLine();
			this.password=sc.nextLine();
			this.loginid=sc.nextLine(); 
			if(loginid.equals(this.loginid) && password.equals(this.password) )
			{
				Loginstatus=true;
			}
				
		}
		
		//System.out.println(Loginstatus);
		return Loginstatus;
	}	
	static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        {
			if (Character.isDigit(s.charAt(i))== false) 
            {
				return false; 
			}
		}
        return true; 
    } 
	public void StoreData() throws IOException
	{
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("data.txt",true); 
		
		fw.write("\n");
        fw.write(firstname);
		fw.write("\n");
		fw.write(lastname);
		fw.write("\n");
		fw.write(mobileno);
		fw.write("\n");
		fw.write(emailid);
		fw.write("\n");
		fw.write(username);
		fw.write("\n");
		fw.write(password);
		fw.write("\n");
		fw.write(loginid); 
		
  
        //close the file  
        fw.close(); 
    } 
	public boolean GetData() throws Exception
	{
		System.out.println("PLEASE ENTER THE FOLLOWING DETAILS :");
		System.out.println("");
		do
		{
		System.out.print("FIRSTNAME		:");
		firstname=sc.nextLine();
		}while(firstname.equals(""));
		do
		{
			System.out.print("LASTNAME		:");
			lastname=sc.nextLine();
		}while(lastname.equals(""));
		do
		{
			System.out.print("MOBILE NO		:");
			mobileno=sc.nextLine();
		}while(mobileno.equals("") || !isNumber(mobileno));
		do
		{
			System.out.print("EMAIL ID		:");
			emailid=sc.nextLine();
		}while(emailid.equals(""));
		do
		{
			System.out.print("USERNAME		:");
			username=sc.nextLine();
		}while(username.equals(""));
		do
		{
			System.out.print("PASSWORD		:");
			password=sc.nextLine();
		}while(password.equals(""));
		do
		{
			System.out.print("CONFIRM PASSWORD		:");
			confirmpassword=sc.nextLine();
		}while(!confirmpassword.equals(password));
							
		System.out.println("PRESS F TO CONTINUE");
		sc.next();
		int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 10 
        int rand = (int)(Math.random() * range) + min; 		
		loginid=username+rand;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("----------------------------------Congratulations You Have Been SUCCESSFUL Registered------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("YOUR LOGIN ID ID :	"+loginid);
		System.out.println("");
		System.out.println("YOUR PASSWORD IS :	"+password);
		System.out.println("");
		System.out.println("*please save the above mentioned details for further login");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("PRESS F TO CONTINUE");
		sc.next();
		Loginstatus=true;
		return Loginstatus;
		
	}	
	
	
	
}
