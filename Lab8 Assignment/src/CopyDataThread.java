//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:Code for copying data to other file
import java.io.*;

public class CopyDataThread extends Thread{
	FileReader fr=null;
	FileWriter fw=null;
	public CopyDataThread(FileReader fr,FileWriter fw)//Creating parameterised constructor
	{
		this.fr=fr;
		this.fw=fw;
	}
	@Override
	public void run()
	{
		int c=0;
		try
		{
			
			int reading;
			
			while((reading=fr.read())>0)
			{
				fw.write(reading);
				c++;
				if(c%10==0)
				{
					Thread.sleep(5000);
					System.out.println("10 characters are read");
				}
			}
			fw.flush();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally//The statement in this block will be printed
		{
			System.out.println("Number of charcters read "+c);
		}
		
	}
}
