
class Thread1 extends Thread
{
		public void run()
		{
			for(int i=1;i<=2;i++)
			{
				System.out.println("\n\nWAIT\n\n");
				try
				{
					sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}	
			}
				
		}
			
}	