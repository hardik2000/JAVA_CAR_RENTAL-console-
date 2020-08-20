import Way.Route;
import java.io.*;
import java.util.Scanner;  
class Rental
{
		Rental()
		{
		
		}
		
		public static void main(String[] args)throws IOException, InterruptedException
		{
			Scanner sc =new Scanner(System.in);
			Customer costumer=new Customer();
			Driver driver=new Driver();
			Vehicle vehicletyp11 =new Vehicle();
			vehicletyp11.InsertData("Micro","2009","3","PETROL","BLACK","MH-32-AV-3243");
			Vehicle vehicletyp12 =new Vehicle();
			vehicletyp12.InsertData("Micro","2012","3","DIESEL","RED","UK-42-MV-1233");
			Vehicle vehicletyp21 =new Vehicle();
			vehicletyp21.InsertData("Mini","2009","4","PETROL","BLACK","DL-32-AV-3243");
			Vehicle vehicletyp22 =new Vehicle();
			vehicletyp22.InsertData("Mini","2009","4","DEISEL","RED","MH-31-DV-6601");
			Vehicle vehicletyp31 =new Vehicle();
			vehicletyp31.InsertData("Seden","2009","5","PETROL","BLACK","DL-32-AC-8547");
			Vehicle vehicletyp32 =new Vehicle();
			vehicletyp32.InsertData("Seden","2009","5","PETROL","BLACK","HR-32-AD-9853");
			Vehicle vehiclefinal =new Vehicle();
					
			String code,input;
			int ch,flag0=0,flag=0,flag1,flag2,temp,fare,rand;
			do
			{
				boolean Loginstatus=false;
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				Rental rent=new Rental();
				do
				{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("---------------------------------------Welcome--------------------------------------");
					System.out.println("");
					System.out.println("");
					if(flag0==1)
					{
						System.out.println("	INVALID LOGIN ENTRY ENTER AGAIN:	\n");
					}
					System.out.println("WHAT WOULD YOU LIKE TO GO FOR");
					System.out.println("FOR  lOGIN PRESS 1");
					System.out.println("FOR  REGISTRATION  PRESS 2");
					System.out.println("");
					ch=sc.nextInt();
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
				
				
					switch(ch)
					{
							case 1: 
								{
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("----------------------------------Welcome To LOGIN FORM---------------------------------");
									System.out.println("");
									System.out.println("");
									try
									{
										Loginstatus=costumer.CheckData();
										//System.out.println(Loginstatus);
									}
									catch(Exception e)
									{
										
									}	
									
									flag0=0;
									break;
								}
							case 2:
								{
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("----------------------------------Welcome To REGISTRTATION FORM------------------------------");
									System.out.println("");
									System.out.println("");
									try
									{
										Loginstatus=costumer.GetData();
										costumer.StoreData();
									}
									catch(Exception e)
									{
										
									}	
									
									flag0=0;
									break;
								}
							default :
								{
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("!!!!!!INVALID ENTRY ENTER AGAIN!!!!!!!");
									System.out.println("");
									System.out.println("");
									
									flag0=1;
									
								}	
					}
					if(!Loginstatus)
					{
						flag0=1;
					}
				}while(flag0==1);
				
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("----------------------------------Congratulations You Have Been SUCCESSFUL LOG IN------------------------------");
				System.out.println("");
				System.out.println("");
				
				Route route=new Route();
				route.TakeData();
				
				String c1;
				System.out.println(route.ShowData());
				System.out.println("PRESS F TO PROCEED	:");
				sc.next();
				//route.ShowFare();
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("----------------------------------VEHICLE TYPE AVAILABLE RIGHT NOW------------------------------");
				System.out.println("");
				System.out.println("");
				
				
				do
				{	
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						
					do
					{
						System.out.println("WHICH VEHICLE TYPE WOULD YOU OPT FOR:");
						System.out.println("FOR "+vehicletyp11.type+" PRESS 1");
						System.out.println("");
						System.out.println("FOR "+vehicletyp21.type+" PRESS 2");
						System.out.println("");
						System.out.println("FOR "+vehicletyp31.type+" PRESS 3");
						ch=sc.nextInt();
						switch(ch)
						{
								case 1: 
									{
										if(vehicletyp11.status || vehicletyp12.status)
										{
											new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
											System.out.println("----------------------------------VEHICLE TYPE 1 AVAILABLE ARE---------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("	1 VEHICLE AVAILABLE:");
											System.out.println(vehicletyp11.ShowDetails());
											System.out.println("-----------------------------------------------------------------------------------------------");
											System.out.println("	2 VEHICLE AVAILABLE:");
											System.out.println(vehicletyp12.ShowDetails());
											System.out.println("-----------------------------------------------------------------------------------------------");
											do
											{
												flag1=1;flag2=1;
												System.out.println("	CHOOSE ANY ONE OUT OF BOTH 1  or   2	:	");
												temp=sc.nextInt();
												switch(temp)
												{
													case 1: 
														{
															if(vehicletyp11.status)
															{
																vehiclefinal=vehicletyp11;
																vehicletyp11.status=false;
																flag2=0;
															}
															else
															{
																flag2=1;
															}
															flag1=0;
															break;
														}
													case 2:
														{
															if(vehicletyp12.status)
															{
																vehiclefinal=vehicletyp12;
																vehicletyp12.status=false;
																flag2=0;
															}
															else
															{
																flag2=1;
															}
															flag1=0;
															break;
														}
													default :
														{
															System.out.println("INVALID ENTRY ENTER AGAIN:");
															flag1=1;
														}	
												}
												if(flag2==1)
												{
													System.out.println("VEHICLE NOT AVAILABLE PLEASE CHOOSE ANOTHER ONE : ");
												}
											}while(flag1==1 || flag2==1);	
											flag=0;
										}
										else
										{
											System.out.println("VEHICLE NOT AVAILABLE PLEASE CHOOSE ANOTHER ONE : ");
											flag=1;
										}	
										break;
									}
								case 2:
									{
										if(vehicletyp21.status || vehicletyp22.status)
										{
											new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
											System.out.println("----------------------------------VEHICLE TYPE 2 AVAILABLE ARE---------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("	1 VEHICLE AVAILABLE:");
											System.out.println(vehicletyp21.ShowDetails());
											System.out.println("-----------------------------------------------------------------------------------------------");
											System.out.println("	2 VEHICLE AVAILABLE:");
											System.out.println(vehicletyp22.ShowDetails());
											System.out.println("-----------------------------------------------------------------------------------------------");
											do
											{
												flag1=1;flag2=1;
												System.out.println("	CHOOSE ANY ONE OUT OF BOTH 1  or   2	:	");
												temp=sc.nextInt();
												switch(temp)
												{
													case 1: 
														{
															if(vehicletyp21.status)
															{
																vehiclefinal=vehicletyp21;
																vehicletyp21.status=false;
																flag2=0;
															}
															else
															{
																flag2=1;
															}
															flag1=0;
															break;
														}
													case 2:
														{
															if(vehicletyp22.status)
															{
																vehiclefinal=vehicletyp22;
																vehicletyp22.status=false;
																flag2=0;
															}
															else
															{
																flag2=1;
															}
											
															flag1=0;
															break;
														}
													default :
														{
															System.out.println("INVALID ENTRY ENTER AGAIN:");
															flag1=1;
														}	
												
												}
												if(flag2==1)
												{
													System.out.println("VEHICLE NOT AVAILABLE PLEASE CHOOSE ANOTHER ONE : ");
												}
											}while(flag1==1 || flag2==1);
											flag=0;
										}
										else
										{
											System.out.println("VEHICLE NOT AVAILABLE PLEASE CHOOSE ANOTHER ONE : ");
											flag=1;
										}
										break;
									}
								case 3:
									{
										if(vehicletyp31.status || vehicletyp32.status)
										{
											new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
											System.out.println("----------------------------------VEHICLE TYPE 3 AVAILABLE ARE---------------------------------");
											System.out.println("");
											System.out.println("");
											System.out.println("	1 VEHICLE AVAILABLE:");
											System.out.println(vehicletyp31.ShowDetails());
											System.out.println("-----------------------------------------------------------------------------------------------");
											System.out.println("	2 VEHICLE AVAILABLE:");
											System.out.println(vehicletyp32.ShowDetails());
											System.out.println("-----------------------------------------------------------------------------------------------");
											do
											{
												flag1=1;flag2=1;
												System.out.println("	CHOOSE ANY ONE OUT OF BOTH 1  or   2	:	");
												temp=sc.nextInt();
												switch(temp)
												{
													case 1: 
														{
															if(vehicletyp31.status)
															{
																vehiclefinal=vehicletyp31;
																vehicletyp31.status=false;
																flag2=0;
															}
															else
															{
																flag2=1;
															}
											
															flag1=0;
															break;
														}
													case 2:
														{
															if(vehicletyp32.status)
															{
																vehiclefinal=vehicletyp32;
																vehicletyp32.status=false;
																flag2=0;
															}
															else
															{
																flag2=1;
															}
											
															flag1=0;
															break;
														}
													default :
														{
															System.out.println("INVALID ENTRY ENTER AGAIN:");
															flag1=1;
														}	
												}
												if(flag2==1)
												{
													System.out.println("VEHICLE NOT AVAILABLE PLEASE CHOOSE ANOTHER ONE : ");
												} 
											}while(flag1==1 || flag2==1);
											flag=0;
										}
										else
										{
											System.out.println("VEHICLE NOT AVAILABLE PLEASE CHOOSE ANOTHER ONE : ");
											flag=1;
										}
										break;
									}	
								default :
									{
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
										System.out.println("!!!!!!INVALID ENTRY ENTER AGAIN!!!!!!!");
										System.out.println("");
										System.out.println("");
										
										flag=1;
										
									}	
						}
					}while(flag==1);
					
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println(vehiclefinal.ShowDetails());
					
					int max = 6; 
					int min = 1; 
					int range = max - min + 1; 
			  
					rand = (int)(Math.random() * range) + min; 	
					System.out.println(driver.ShowDetails(rand));
					fare=route.ShowFare()+vehiclefinal.ShowRate()+driver.ShowRate();
					System.out.println("\n	TOTAL FARE GENERATED		:Rs. "+fare);
					System.out.println("");
					System.out.println("");
				
					System.out.println("PRESS YES TO CONTINUE  OR  NO TO CHOOSE VEHICLE AGAIN");
					code=sc.next();
					if(code.equalsIgnoreCase("no"))
					{
						boolean host=true;
						while(host)
						{
							if(vehiclefinal.number.equals(vehicletyp11.number))
							{
								host=false;
								vehicletyp11.status=true;
							}
							else if(vehiclefinal.number.equals(vehicletyp12.number))
							{
								host=false;
								vehicletyp12.status=true;
							}
							else if(vehiclefinal.number.equals(vehicletyp21.number))
							{
								host=false;
								vehicletyp21.status=true;
							}
							else if(vehiclefinal.number.equals(vehicletyp22.number))
							{
								host=false;
								vehicletyp22.status=true;
							}
							else if(vehiclefinal.number.equals(vehicletyp31.number))
							{
								host=false;
								vehicletyp31.status=true;
							}
							else if(vehiclefinal.number.equals(vehicletyp32.number))
							{
								host=false;
								vehicletyp32.status=true;
							}
							
						}
					}
				}while(code.equalsIgnoreCase("no"));
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
				Thread1 z1=new Thread1();
				Thread b=new Thread(z1);
				z1.start();
				z1.join(2000);
				Thread2 z2=new Thread2();
				Thread c=new Thread(z2);
				z2.start();
				z2.join(2000);
			
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("---------------------------FINAL DETAILS OF BOOKING ARE : BOOKING CONFIRMED------------------------");
				System.out.println(vehiclefinal.ShowDetails());
				
				System.out.println(driver.ShowDetails(rand));
				System.out.println(route.ShowData());
				System.out.println("	TOTAL FARE GENERATED		:Rs. "+fare);
				System.out.println("--------------------------* take the screenshot for further details--------------------------");
				vehiclefinal.status=false;
				
				//WRITTING ALL TRASACTIONS IN FILE transaction.txt
				
				FileWriter fw=new FileWriter("transaction.txt",true); 
		
				fw.write("\n");
				fw.write("---------------------------FINAL DETAILS OF BOOKING ARE : BOOKING CONFIRMED------------------------");
				fw.write("\n");
				fw.write(vehiclefinal.ShowDetails());
				fw.write("\n");
				fw.write(driver.ShowDetails(rand));
				fw.write("\n");
				fw.write(route.ShowData());
				fw.write("\n");
				fw.write("	TOTAL FARE GENERATED		:Rs. "+fare);
				fw.write("\n");
				fw.write("--------------------------* take the screenshot for further details--------------------------");
				fw.write("\n");
			
		  
				//close the file  
				fw.close(); 
				System.out.println("DO YOU WANT TO CONTINUE BOOKING ANOTHER VEHICLE(Y/N)");
				input=sc.next();
			}while(input.equalsIgnoreCase("y"));	
		}
}	